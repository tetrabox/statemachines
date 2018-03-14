package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Transition;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  @Step
  public static void fire(final Transition _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_fire(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Transition", "fire");
	} else {
		command.execute();
	}
	;
	;
}
  
  protected static void _privk3_fire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    String _name = _self.getName();
    String _plus = ("Firing " + _name);
    InputOutput.<String>println(_plus);
    EObject _eContainer = _self.eContainer().eContainer();
    Vertex _target = _self.getTarget();
    StateMachineAspect.currentState(((StateMachine) _eContainer), ((State) _target));
  }
}
