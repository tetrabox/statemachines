package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import com.google.common.collect.ImmutableList;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.inria.diverse.melange.annotation.Containment;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine;

@Aspect(className = StateMachine.class)
@SuppressWarnings("all")
public class StateMachineAspect {
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
  
  @Containment
  public static EList<EventOccurrence> queue(final StateMachine _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_queue(_self_, _self);
	;
	return (org.eclipse.emf.common.util.EList) result;
}
  
  @Containment
  public static void queue(final StateMachine _self, final EList<EventOccurrence> queue) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void queue(EList<EventOccurrence>)
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine){
    	org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspect._privk3_queue(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine)_self,queue);
    };
  }
  
  protected static void _privk3_run(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    List<EventOccurrence> _immutableCopy = ImmutableList.<EventOccurrence>copyOf(StateMachineAspect.queue(_self));
    for (final EventOccurrence eventOccurrence : _immutableCopy) {
      {
        StateMachineAspect.queue(_self).remove(eventOccurrence);
        RegionAspect.handleEvent(IterableExtensions.<Region>head(_self.getRegion()), eventOccurrence);
      }
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
