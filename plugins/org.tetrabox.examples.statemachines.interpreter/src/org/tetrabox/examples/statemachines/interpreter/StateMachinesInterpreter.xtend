package org.tetrabox.examples.statemachines.interpreter

import execution.statemachines.EventOccurrence
import execution.statemachines.StatemachinesFactory
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.List
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import statemachines.CustomSystem
import statemachines.almostuml.FinalState
import statemachines.almostuml.Pseudostate
import statemachines.almostuml.PseudostateKind
import statemachines.almostuml.State
import statemachines.almostuml.StateMachine
import statemachines.almostuml.Transition

import static extension org.tetrabox.examples.statemachines.interpreter.StateAspect.*
import static extension org.tetrabox.examples.statemachines.interpreter.StateMachineAspect.*
import static extension org.tetrabox.examples.statemachines.interpreter.TransitionAspect.*

@Aspect(className=CustomSystem)
class CustomSystemAspect {

	@InitializeModel
	def void initialize(List<String> args) {
		// Transform entered strings into a queue of event occurrences
		for (a : args.filter[!it.isNullOrEmpty]) {
			val correspondingEvent = _self.events.findFirst[it.name == a]
			if (correspondingEvent !== null) {
				val occurrence = StatemachinesFactory::eINSTANCE.createEventOccurrence => [
					event = correspondingEvent
				]
				_self.statemachine.queueEventOccurrence(occurrence)
			} else {
				println("Warning: ignoring unrecognized event '" + a + "'")
			}
		}
	}

	@Main
	def void main() {
		_self.statemachine.run()
		println("End of execution")
	}
}

@Aspect(className=StateMachine)
class StateMachineAspect {

	public State currentState
	public EList<EventOccurrence> queue = new BasicEList<EventOccurrence>

	def void queueEventOccurrence(EventOccurrence eventOccurrence) {
		_self.queue.add(eventOccurrence)
	}

	@Step
	def void run() {

		// Find initial state
		_self.currentState = _self.region.head.subvertex.filter(Pseudostate).findFirst [
			it.kind == PseudostateKind::INITIAL
		]

		println("Initial state: " + _self.currentState.name)

		// Empty the event queue into the states
		for (eventOccurrence : _self.queue) {
			_self.currentState.handle(eventOccurrence)
			println("Current state: " + _self.currentState.name)
		}
	}

}

@Aspect(className=State)
class StateAspect {
	def void handle(EventOccurrence eventOccurrence) {
		println("Handling occurrence of " + eventOccurrence.event.name)
		val outTransitions = _self.container.transition.filter[it.source === _self]
		val candidate = outTransitions.findFirst[it.trigger.exists[it.event === eventOccurrence.event]] // TODO		
		if (candidate !== null) {
			candidate.fire
		}
	}
}

@Aspect(className=Transition)
class TransitionAspect {

	@Step
	def void fire() {
		println("Firing " + _self.name)
		(_self.eContainer.eContainer as StateMachine).currentState = _self.target as State
	}

}

@Aspect(className=FinalState)
class FinalStateAspect extends StateAspect {

	@OverrideAspectMethod
	@Step
	def void handle(EventOccurrence eventOccurrence) {
	}
}
