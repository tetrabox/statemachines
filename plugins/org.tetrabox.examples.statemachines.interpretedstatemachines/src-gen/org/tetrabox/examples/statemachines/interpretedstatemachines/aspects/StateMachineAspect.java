package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.PseudostateKind;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine;

@Aspect(className = StateMachine.class)
@SuppressWarnings("all")
public class StateMachineAspect {
  public static void queueEventOccurrence(final StateMachine _self, final EventOccurrence eventOccurrence) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	_privk3_queueEventOccurrence(_self_, _self, eventOccurrence);
	;
}
  
  @Step
  public static void run(final StateMachine _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_run(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "StateMachine", "run");
	} else {
		command.execute();
	}
	;
	;
}
  
  public static State currentState(final StateMachine _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_currentState(_self_, _self);
	;
	return (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State) result;
}
  
  public static void currentState(final StateMachine _self, final State currentState) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	_privk3_currentState(_self_, _self, currentState);
	;
}
  
  public static EList<EventOccurrence> queue(final StateMachine _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_queue(_self_, _self);
	;
	return (org.eclipse.emf.common.util.EList) result;
}
  
  public static void queue(final StateMachine _self, final EList<EventOccurrence> queue) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_queue(_self_, _self,queue);;
  }
  
  protected static void _privk3_queueEventOccurrence(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final EventOccurrence eventOccurrence) {
    StateMachineAspect.queue(_self).add(eventOccurrence);
  }
  
  protected static void _privk3_run(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    final Function1<Pseudostate, Boolean> _function = (Pseudostate it) -> {
      PseudostateKind _kind = it.getKind();
      return Boolean.valueOf(Objects.equal(_kind, PseudostateKind.INITIAL));
    };
    StateMachineAspect.currentState(_self, IterableExtensions.<Pseudostate>findFirst(Iterables.<Pseudostate>filter(IterableExtensions.<Region>head(_self.getRegion()).getSubvertex(), Pseudostate.class), _function));
    String _name = StateMachineAspect.currentState(_self).getName();
    String _plus = ("Initial state: " + _name);
    InputOutput.<String>println(_plus);
    EList<EventOccurrence> _queue = StateMachineAspect.queue(_self);
    for (final EventOccurrence eventOccurrence : _queue) {
      {
        StateAspect.handle(StateMachineAspect.currentState(_self), eventOccurrence);
        String _name_1 = StateMachineAspect.currentState(_self).getName();
        String _plus_1 = ("Current state: " + _name_1);
        InputOutput.<String>println(_plus_1);
      }
    }
  }
  
  protected static State _privk3_currentState(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentState") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentState;
  }
  
  protected static void _privk3_currentState(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final State currentState) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentState")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentState);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentState = currentState;
    }
  }
  
  protected static EList<EventOccurrence> _privk3_queue(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getQueue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.emf.common.util.EList) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.queue;
  }
  
  protected static void _privk3_queue(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final EList<EventOccurrence> queue) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setQueue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, queue);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.queue = queue;
    }
  }
}
