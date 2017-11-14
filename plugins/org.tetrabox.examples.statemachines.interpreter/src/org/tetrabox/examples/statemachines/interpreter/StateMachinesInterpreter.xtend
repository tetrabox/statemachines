package org.tetrabox.examples.statemachines.interpreter

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import statemachines.CustomSystem
import statemachines.almostuml.FinalState
import statemachines.almostuml.Pseudostate
import statemachines.almostuml.PseudostateKind
import statemachines.almostuml.State
import statemachines.almostuml.StateMachine
import statemachines.almostuml.Transition
import statemachinesexecutiondata.EventOccurrence
import statemachinesexecutiondata.StatemachinesexecutiondataFactory

import static extension org.tetrabox.examples.statemachines.interpreter.StateAspect.*
import static extension org.tetrabox.examples.statemachines.interpreter.StateMachineAspect.*
import static extension org.tetrabox.examples.statemachines.interpreter.TransitionAspect.*

@Aspect(className=CustomSystem)
class CustomSystemAspect {

	@Main
	@Step
	def void run(EList<String> args) {

		// Transform entered strings into a queue of event occurrences
		for (a : args) {
			val correspondingEvent = _self.events.findFirst[it.name == a]
			val occurrence = StatemachinesexecutiondataFactory::eINSTANCE.createEventOccurrence => [
				event = correspondingEvent
			]
			_self.statemachine.queueEventOccurrence(occurrence)
		}

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
	def void run(EList<String> args) {

		// Find initial state
		_self.currentState = _self.region.head.subvertex.filter(Pseudostate).findFirst [
			it.kind == PseudostateKind::INITIAL
		]

		// Empty the event queue into the states
		for (eventOccurrence : _self.queue) {
			_self.currentState = _self.currentState.handle(eventOccurrence)
		}
	}

}

@Aspect(className=State)
class StateAspect {

	def State handle(Object eventOccurrence) {
		throw new Exception("handle must be overridden for managing : " + _self)
	}

}

@Aspect(className=Transition)
class TransitionAspect {

	@Step
	def State fire() {
		return _self.target as State
	}

}

@Aspect(className=FinalState)
class FinalStateAspect extends StateAspect {

	@OverrideAspectMethod
	@Step
	def State handle(EventOccurrence eventOccurrence) {
		return _self
	}
}

@Aspect(className=Pseudostate)
class PseudostateAspect extends StateAspect {

	@OverrideAspectMethod
	@Step
	def State handle(EventOccurrence eventOccurrence) {
		val outTransitions = _self.container.transition.filter[it.source === _self]
		val candidate = outTransitions.findFirst[it.trigger.exists[it.event === eventOccurrence.event]] // TODO		
		if (candidate !== null) {
			return candidate.fire
		} else {
			return _self
		}
	}
}
