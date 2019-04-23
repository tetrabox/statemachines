package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.Util;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomEvent;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Event;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Transition;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Trigger;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  public static void setAsCurrent(final State _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	_privk3_setAsCurrent(_self_, _self);
	;
}
  
  @Step
  public static void handle(final State _self, final EventOccurrence eventOccurrence) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect._privk3_handle(_self_,
						(org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate) _self,
						eventOccurrence);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "State", "handle");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.FinalState) {
		org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.FinalStateAspect.handle(
				(org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.FinalState) _self,
				eventOccurrence);
	} else if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect._privk3_handle(_self_,
						(org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State) _self,
						eventOccurrence);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "State", "handle");
		} else {
			command.execute();
		}
		;
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  protected static void _privk3_setAsCurrent(final StateAspectStateAspectProperties _self_, final State _self) {
    Region _container = _self.getContainer();
    RegionAspect.currentState(_container, _self);
    boolean _isEmpty = _self.getRegion().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      RegionAspect.initialize(IterableExtensions.<Region>head(_self.getRegion()));
    }
  }
  
  protected static void _privk3_handle(final StateAspectStateAspectProperties _self_, final State _self, final EventOccurrence eventOccurrence) {
    try {
      String _name = _self.getName();
      String _plus = ("Trying in state " + _name);
      String _plus_1 = (_plus + " occurrence of ");
      String _name_1 = eventOccurrence.getEvent().getName();
      String _plus_2 = (_plus_1 + _name_1);
      Util.log(_plus_2);
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
      final Iterable<Transition> candidates = IterableExtensions.<Transition>filter(outTransitions, _function_1);
      int _size = IterableExtensions.size(candidates);
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        throw new Exception("The state machine is not deterministic!");
      } else {
        boolean _isEmpty = IterableExtensions.isEmpty(candidates);
        boolean _not = (!_isEmpty);
        if (_not) {
          Region _head = IterableExtensions.<Region>head(_self.getRegion());
          boolean _tripleNotEquals = (_head != null);
          if (_tripleNotEquals) {
            Region _head_1 = IterableExtensions.<Region>head(_self.getRegion());
            RegionAspect.currentState(_head_1, null);
          }
          TransitionAspect.fire(((Transition[])Conversions.unwrapArray(candidates, Transition.class))[0]);
        } else {
          Region _head_2 = IterableExtensions.<Region>head(_self.getRegion());
          if (_head_2!=null) {
            RegionAspect.handleEvent(_head_2, eventOccurrence);
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
