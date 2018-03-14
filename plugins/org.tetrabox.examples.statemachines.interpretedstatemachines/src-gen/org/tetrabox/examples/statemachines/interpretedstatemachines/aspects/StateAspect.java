package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomEvent;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Event;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Transition;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Trigger;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  public static void handle(final State _self, final EventOccurrence eventOccurrence) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate) {
		org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect._privk3_handle(_self_,
				(org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate) _self,
				eventOccurrence);
	} else if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.FinalState) {
		org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.FinalStateAspect.handle(
				(org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.FinalState) _self,
				eventOccurrence);
	} else if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State) {
		org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect._privk3_handle(_self_,
				(org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State) _self,
				eventOccurrence);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  protected static void _privk3_handle(final StateAspectStateAspectProperties _self_, final State _self, final EventOccurrence eventOccurrence) {
    String _name = eventOccurrence.getEvent().getName();
    String _plus = ("Handling occurrence of " + _name);
    InputOutput.<String>println(_plus);
    final Function1<Transition, Boolean> _function = (Transition it) -> {
      Vertex _source = it.getSource();
      return Boolean.valueOf((_source == _self));
    };
    final Iterable<Transition> outTransitions = IterableExtensions.<Transition>filter(_self.getContainer().getTransition(), _function);
    final Function1<Transition, Boolean> _function_1 = (Transition it) -> {
      final Function1<Trigger, Boolean> _function_2 = (Trigger it_1) -> {
        Event _event = it_1.getEvent();
        CustomEvent _event_1 = eventOccurrence.getEvent();
        return Boolean.valueOf((_event == _event_1));
      };
      return Boolean.valueOf(IterableExtensions.<Trigger>exists(it.getTrigger(), _function_2));
    };
    final Transition candidate = IterableExtensions.<Transition>findFirst(outTransitions, _function_1);
    if ((candidate != null)) {
      TransitionAspect.fire(candidate);
    }
  }
}
