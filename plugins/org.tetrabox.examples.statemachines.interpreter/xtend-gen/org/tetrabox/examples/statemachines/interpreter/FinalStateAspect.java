package org.tetrabox.examples.statemachines.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.tetrabox.examples.statemachines.interpreter.FinalStateAspectFinalStateAspectProperties;
import org.tetrabox.examples.statemachines.interpreter.StateAspect;
import statemachines.almostuml.FinalState;
import statemachines.almostuml.State;
import statemachinesexecutiondata.EventOccurrence;

@Aspect(className = FinalState.class)
@SuppressWarnings("all")
public class FinalStateAspect extends StateAspect {
  @OverrideAspectMethod
  @Step
  public static State handle(final FinalState _self, final EventOccurrence eventOccurrence) {
    final org.tetrabox.examples.statemachines.interpreter.FinalStateAspectFinalStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpreter.FinalStateAspectFinalStateAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof statemachines.almostuml.FinalState){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							addToResult(org.tetrabox.examples.statemachines.interpreter.FinalStateAspect._privk3_handle(_self_, (statemachines.almostuml.FinalState)_self,eventOccurrence));
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"FinalState","handle");
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
  
  private static State super_handle(final FinalState _self, final EventOccurrence eventOccurrence) {
    final org.tetrabox.examples.statemachines.interpreter.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpreter.StateAspectStateAspectContext.getSelf(_self);
    return  org.tetrabox.examples.statemachines.interpreter.StateAspect._privk3_handle(_self_, _self,eventOccurrence);
  }
  
  protected static State _privk3_handle(final FinalStateAspectFinalStateAspectProperties _self_, final FinalState _self, final EventOccurrence eventOccurrence) {
    return _self;
  }
}
