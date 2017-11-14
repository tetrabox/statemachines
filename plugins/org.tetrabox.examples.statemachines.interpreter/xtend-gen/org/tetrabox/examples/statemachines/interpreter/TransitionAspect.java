package org.tetrabox.examples.statemachines.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.tetrabox.examples.statemachines.interpreter.TransitionAspectTransitionAspectProperties;
import statemachines.almostuml.State;
import statemachines.almostuml.Transition;
import statemachines.almostuml.Vertex;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  @Step
  public static State fire(final Transition _self) {
    final org.tetrabox.examples.statemachines.interpreter.TransitionAspectTransitionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpreter.TransitionAspectTransitionAspectContext.getSelf(_self);
    Object result = null;
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		addToResult(_privk3_fire(_self_, _self));
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Transition","fire");
    } else {
    	command.execute();
    }
    result = command.getResult();
    ;;
    return (statemachines.almostuml.State)result;
  }
  
  protected static State _privk3_fire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    Vertex _target = _self.getTarget();
    return ((State) _target);
  }
}
