package org.tetrabox.examples.statemachines.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.tetrabox.examples.statemachines.interpreter.CustomSystemAspectCustomSystemAspectProperties;
import org.tetrabox.examples.statemachines.interpreter.StateMachineAspect;
import statemachines.CustomSystem;

@Aspect(className = CustomSystem.class)
@SuppressWarnings("all")
public class CustomSystemAspect {
  @Main
  @Step
  public static void run(final CustomSystem _self, final EList<String> args) {
    final org.tetrabox.examples.statemachines.interpreter.CustomSystemAspectCustomSystemAspectProperties _self_ = org.tetrabox.examples.statemachines.interpreter.CustomSystemAspectCustomSystemAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_run(_self_, _self,args);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"CustomSystem","run");
    } else {
    	command.execute();
    }
    ;;
  }
  
  protected static void _privk3_run(final CustomSystemAspectCustomSystemAspectProperties _self_, final CustomSystem _self, final EList<String> args) {
    for (final String a : args) {
      StateMachineAspect.queueEventOccurrence(_self.getStatemachine(), null);
    }
  }
}
