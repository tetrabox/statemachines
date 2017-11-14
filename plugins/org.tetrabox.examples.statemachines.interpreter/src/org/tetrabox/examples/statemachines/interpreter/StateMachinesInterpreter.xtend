package org.tetrabox.examples.statemachines.interpreter

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.emf.common.util.EList
import statemachines.CustomSystem
import statemachines.almostuml.Constraint
import statemachines.almostuml.Event
import statemachines.almostuml.FinalState
import statemachines.almostuml.Pseudostate
import statemachines.almostuml.PseudostateKind
import statemachines.almostuml.State
import statemachines.almostuml.StateMachine
import statemachines.almostuml.Transition
import statemachines.almostuml.Trigger

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
			_self.statemachine.queueEventOccurrence(null) // TODO
		}

	}

}


@Aspect(className=StateMachine)
class StateMachineAspect  {

	public State currentState
	public EList<Object> queue

	def void queueEventOccurrence(Object eventOccurrence) {
		// TODO
	}

	@Step
	def void run(EList<String> args) {

		// Find initial state
		_self.currentState = _self.region.head.subvertex.filter(Pseudostate).findFirst [
			it.kind == PseudostateKind::INITIAL
		]

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
class TransitionAspect  {

	@Step
	def State fire() {
		return _self.target as State
	}

}

@Aspect(className=Trigger)
class TriggerAspect  {
}

@Aspect(className=Constraint)
abstract class ConstraintAspect {
}



@Aspect(className=Event)
abstract class EventAspect {
}

@Aspect(className=FinalState)
class FinalStateAspect extends StateAspect {
}

@Aspect(className=Pseudostate)
class PseudostateAspect extends StateAspect {

	@OverrideAspectMethod
	@Step
	def State handle(Object eventOccurrence) {
		val outTransitions = _self.container.transition.filter[it.source === _self]
		val candidate = outTransitions.findFirst[it.trigger.exists[it.event === eventOccurrence]] // TODO		
		if (candidate !== null) {
			return candidate.fire
		} else {
			return _self
		}
	}
}
