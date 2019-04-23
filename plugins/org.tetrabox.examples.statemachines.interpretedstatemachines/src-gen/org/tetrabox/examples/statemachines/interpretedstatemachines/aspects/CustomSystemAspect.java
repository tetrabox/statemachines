package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import com.google.common.base.Objects;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesFactory;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CustomSystemAspectCustomSystemAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.Util;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomEvent;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomSystem;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region;

@Aspect(className = CustomSystem.class)
@SuppressWarnings("all")
public class CustomSystemAspect {
  @InitializeModel
  @Step
  public static void initialize(final CustomSystem _self, final List<String> args) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CustomSystemAspectCustomSystemAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CustomSystemAspectCustomSystemAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void initialize(List<String>)
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomSystem){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CustomSystemAspect._privk3_initialize(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomSystem)_self,args);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {args}, command, "CustomSystem", "initialize");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Main
  public static void main(final CustomSystem _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CustomSystemAspectCustomSystemAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CustomSystemAspectCustomSystemAspectContext
			.getSelf(_self);
	_privk3_main(_self_, _self);
	;
}
  
  protected static void _privk3_initialize(final CustomSystemAspectCustomSystemAspectProperties _self_, final CustomSystem _self, final List<String> args) {
    final Function1<String, Boolean> _function = (String it) -> {
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(it);
      return Boolean.valueOf((!_isNullOrEmpty));
    };
    Iterable<String> _filter = IterableExtensions.<String>filter(args, _function);
    for (final String a : _filter) {
      {
        final Function1<CustomEvent, Boolean> _function_1 = (CustomEvent it) -> {
          String _name = it.getName();
          return Boolean.valueOf(Objects.equal(_name, a));
        };
        final CustomEvent correspondingEvent = IterableExtensions.<CustomEvent>findFirst(_self.getEvents(), _function_1);
        if ((correspondingEvent != null)) {
          EventOccurrence _createEventOccurrence = StatemachinesFactory.eINSTANCE.createEventOccurrence();
          final Procedure1<EventOccurrence> _function_2 = (EventOccurrence it) -> {
            it.setEvent(correspondingEvent);
          };
          final EventOccurrence occurrence = ObjectExtensions.<EventOccurrence>operator_doubleArrow(_createEventOccurrence, _function_2);
          StateMachineAspect.queue(_self.getStatemachine()).add(occurrence);
        } else {
          Util.log((("Warning: ignoring unrecognized event \'" + a) + "\'"));
        }
      }
    }
    RegionAspect.initialize(IterableExtensions.<Region>head(_self.getStatemachine().getRegion()));
  }
  
  protected static void _privk3_main(final CustomSystemAspectCustomSystemAspectProperties _self_, final CustomSystem _self) {
    StateMachineAspect.run(_self.getStatemachine());
    Util.log("End of execution");
  }
}
