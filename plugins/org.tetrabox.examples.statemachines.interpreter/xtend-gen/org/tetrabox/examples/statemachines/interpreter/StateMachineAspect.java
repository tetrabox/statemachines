package org.tetrabox.examples.statemachines.interpreter;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.examples.statemachines.interpreter.StateAspect;
import org.tetrabox.examples.statemachines.interpreter.StateMachineAspectStateMachineAspectProperties;
import statemachines.almostuml.Pseudostate;
import statemachines.almostuml.PseudostateKind;
import statemachines.almostuml.Region;
import statemachines.almostuml.State;
import statemachines.almostuml.StateMachine;

@Aspect(className = StateMachine.class)
@SuppressWarnings("all")
public class StateMachineAspect {
  public static void queueEventOccurrence(final StateMachine _self, final Object eventOccurrence) {
    final org.tetrabox.examples.statemachines.interpreter.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpreter.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_queueEventOccurrence(_self_, _self,eventOccurrence);;
  }
  
  @Step
  public static void run(final StateMachine _self, final EList<String> args) {
    final org.tetrabox.examples.statemachines.interpreter.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpreter.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_run(_self_, _self,args);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"StateMachine","run");
    } else {
    	command.execute();
    }
    ;;
  }
  
  public static State currentState(final StateMachine _self) {
    final org.tetrabox.examples.statemachines.interpreter.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpreter.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_currentState(_self_, _self);;
    return (statemachines.almostuml.State)result;
  }
  
  public static void currentState(final StateMachine _self, final State currentState) {
    final org.tetrabox.examples.statemachines.interpreter.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpreter.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_currentState(_self_, _self,currentState);;
  }
  
  public static EList<Object> queue(final StateMachine _self) {
    final org.tetrabox.examples.statemachines.interpreter.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpreter.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_queue(_self_, _self);;
    return (org.eclipse.emf.common.util.EList<java.lang.Object>)result;
  }
  
  public static void queue(final StateMachine _self, final EList<Object> queue) {
    final org.tetrabox.examples.statemachines.interpreter.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpreter.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_queue(_self_, _self,queue);;
  }
  
  protected static void _privk3_queueEventOccurrence(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final Object eventOccurrence) {
  }
  
  protected static void _privk3_run(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final EList<String> args) {
    final Function1<Pseudostate, Boolean> _function = (Pseudostate it) -> {
      PseudostateKind _kind = it.getKind();
      return Boolean.valueOf(Objects.equal(_kind, PseudostateKind.INITIAL));
    };
    StateMachineAspect.currentState(_self, IterableExtensions.<Pseudostate>findFirst(Iterables.<Pseudostate>filter(IterableExtensions.<Region>head(_self.getRegion()).getSubvertex(), Pseudostate.class), _function));
    EList<Object> _queue = StateMachineAspect.queue(_self);
    for (final Object eventOccurrence : _queue) {
      StateMachineAspect.currentState(_self, StateAspect.handle(StateMachineAspect.currentState(_self), eventOccurrence));
    }
  }
  
  protected static State _privk3_currentState(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentState") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (statemachines.almostuml.State) ret;
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
  
  protected static EList<Object> _privk3_queue(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
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
  
  protected static void _privk3_queue(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final EList<Object> queue) {
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
