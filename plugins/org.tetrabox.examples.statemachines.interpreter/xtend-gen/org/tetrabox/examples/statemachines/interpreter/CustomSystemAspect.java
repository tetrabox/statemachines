package org.tetrabox.examples.statemachines.interpreter;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.tetrabox.examples.statemachines.interpreter.CustomSystemAspectCustomSystemAspectProperties;
import org.tetrabox.examples.statemachines.interpreter.StateMachineAspect;
import statemachines.CustomEvent;
import statemachines.CustomSystem;
import statemachinesexecutiondata.EventOccurrence;
import statemachinesexecutiondata.StatemachinesexecutiondataFactory;

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
      {
        final Function1<CustomEvent, Boolean> _function = (CustomEvent it) -> {
          String _name = it.getName();
          return Boolean.valueOf(Objects.equal(_name, a));
        };
        final CustomEvent correspondingEvent = IterableExtensions.<CustomEvent>findFirst(_self.getEvents(), _function);
        EventOccurrence _createEventOccurrence = StatemachinesexecutiondataFactory.eINSTANCE.createEventOccurrence();
        final Procedure1<EventOccurrence> _function_1 = (EventOccurrence it) -> {
          it.setEvent(correspondingEvent);
        };
        final EventOccurrence occurrence = ObjectExtensions.<EventOccurrence>operator_doubleArrow(_createEventOccurrence, _function_1);
        StateMachineAspect.queueEventOccurrence(_self.getStatemachine(), occurrence);
      }
    }
  }
}
