package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.FinalStateAspectFinalStateAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.FinalState;

@Aspect(className = FinalState.class)
@SuppressWarnings("all")
public class FinalStateAspect extends StateAspect {
  @OverrideAspectMethod
  @Step
  public static void handle(final FinalState _self, final EventOccurrence eventOccurrence) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.FinalStateAspectFinalStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.FinalStateAspectFinalStateAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_handle(_self_, _self, eventOccurrence);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "FinalState", "handle");
	} else {
		command.execute();
	}
	;
	;
}
  
  private static void super_handle(final FinalState _self, final EventOccurrence eventOccurrence) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
     org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect._privk3_handle(_self_, _self,eventOccurrence);
  }
  
  protected static void _privk3_handle(final FinalStateAspectFinalStateAspectProperties _self_, final FinalState _self, final EventOccurrence eventOccurrence) {
  }
}
