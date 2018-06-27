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
import statemachines.almostuml.Region
import statemachines.almostuml.State
import statemachines.almostuml.StateMachine
import statemachines.almostuml.Transition

import static extension org.tetrabox.examples.statemachines.interpreter.StateAspect.*
import static extension org.tetrabox.examples.statemachines.interpreter.TransitionAspect.*
import static extension org.tetrabox.examples.statemachines.interpreter.RegionAspect.*
import static extension org.tetrabox.examples.statemachines.interpreter.StateMachineAspect.*


class Util {
	static def void log(String l) {
		//println(l)
	}
}

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
				_self.statemachine.queue.add(occurrence)
			} else {
				Util::log("Warning: ignoring unrecognized event '" + a + "'")
			}
		}
		_self.statemachine.region.head.initialize
	}

	@Main
	def void main() {
		_self.statemachine.run
		Util::log("End of execution")
	}
}

@Aspect(className=StateMachine)
class StateMachineAspect {
	
	public EList<EventOccurrence> queue = new BasicEList<EventOccurrence>

	@Step
	def void run() {
		for (eventOccurrence : _self.queue) {
			_self.region.head.handleEvent(eventOccurrence)
		}
	}

}

@Aspect(className=Region)
class RegionAspect {

	public State currentState

	@Step
	def void initialize() {
		// Find initial state
		_self.currentState = _self.subvertex.filter(Pseudostate).findFirst [
			it.kind == PseudostateKind::INITIAL
		]
		Util::log("Initial state of region \"" + _self.name + "\": " + _self.currentState.name)
	}

	@Step
	def void handleEvent(EventOccurrence eventOccurrence) {
		Util::log("Handling " + eventOccurrence.event.name)
		_self.currentState.handle(eventOccurrence)
		Util::log("Current state of region \"" + _self.name + "\": " + _self.currentState.name)
	}

}

@Aspect(className=State)
class StateAspect {

	def void setAsCurrent() {
		_self.container.currentState = _self
		if (!_self.region.empty) {
			_self.region.head.initialize
		}
	}

	@Step
	def void handle(EventOccurrence eventOccurrence) {
		Util::log("Trying in state " + _self.name + " occurrence of " + eventOccurrence.event.name)
		val outTransitions = _self.container.transition.filter[it.source === _self]
		val candidate = outTransitions.findFirst[it.trigger.exists[it.event === eventOccurrence.event]] // TODO		
		if (candidate !== null) {
			if (_self.region.head !== null) {
				_self.region.head.currentState = null
			}
			candidate.fire()
		} else {
			_self.region.head?.handleEvent(eventOccurrence)
		}
	}
}

@Aspect(className=Transition)
class TransitionAspect {

	@Step
	def void fire() {
		Util::log("Firing " + _self.name)
		(_self.target as State).setAsCurrent
	}
}

@Aspect(className=FinalState)
class FinalStateAspect extends StateAspect {

	@OverrideAspectMethod
	@Step
	def void handle(EventOccurrence eventOccurrence) {
	}
}
