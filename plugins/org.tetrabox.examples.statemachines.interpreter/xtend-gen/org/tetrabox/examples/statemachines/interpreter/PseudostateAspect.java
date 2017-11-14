package org.tetrabox.examples.statemachines.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.examples.statemachines.interpreter.PseudostateAspectPseudostateAspectProperties;
import org.tetrabox.examples.statemachines.interpreter.StateAspect;
import org.tetrabox.examples.statemachines.interpreter.TransitionAspect;
import statemachines.CustomEvent;
import statemachines.almostuml.Event;
import statemachines.almostuml.Pseudostate;
import statemachines.almostuml.State;
import statemachines.almostuml.Transition;
import statemachines.almostuml.Trigger;
import statemachines.almostuml.Vertex;
import statemachinesexecutiondata.EventOccurrence;

@Aspect(className = Pseudostate.class)
@SuppressWarnings("all")
public class PseudostateAspect extends StateAspect {
  @OverrideAspectMethod
  @Step
  public static State handle(final Pseudostate _self, final EventOccurrence eventOccurrence) {
    final org.tetrabox.examples.statemachines.interpreter.PseudostateAspectPseudostateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpreter.PseudostateAspectPseudostateAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof statemachines.almostuml.Pseudostate){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							addToResult(org.tetrabox.examples.statemachines.interpreter.PseudostateAspect._privk3_handle(_self_, (statemachines.almostuml.Pseudostate)_self,eventOccurrence));
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"Pseudostate","handle");
    					} else {
    						command.execute();
    					}
    					result = command.getResult();
    					;
    } else  if (_self instanceof statemachines.almostuml.State){
    					result = org.tetrabox.examples.statemachines.interpreter.StateAspect.handle((statemachines.almostuml.State)_self,eventOccurrence);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (statemachines.almostuml.State)result;
  }
  
  private static State super_handle(final Pseudostate _self, final EventOccurrence eventOccurrence) {
    final org.tetrabox.examples.statemachines.interpreter.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpreter.StateAspectStateAspectContext.getSelf(_self);
    return  org.tetrabox.examples.statemachines.interpreter.StateAspect._privk3_handle(_self_, _self,eventOccurrence);
  }
  
  protected static State _privk3_handle(final PseudostateAspectPseudostateAspectProperties _self_, final Pseudostate _self, final EventOccurrence eventOccurrence) {
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
      return TransitionAspect.fire(candidate);
    } else {
      return _self;
    }
  }
}
