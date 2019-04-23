package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.Util;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.PseudostateKind;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State;

@Aspect(className = Region.class)
@SuppressWarnings("all")
public class RegionAspect {
  public static void initialize(final Region _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectContext
			.getSelf(_self);
	_privk3_initialize(_self_, _self);
	;
}
  
  public static void handleEvent(final Region _self, final EventOccurrence eventOccurrence) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectContext
			.getSelf(_self);
	_privk3_handleEvent(_self_, _self, eventOccurrence);
	;
}
  
  public static State currentState(final Region _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_currentState(_self_, _self);
	;
	return (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State) result;
}
  
  public static void currentState(final Region _self, final State currentState) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectContext
			.getSelf(_self);
	_privk3_currentState(_self_, _self, currentState);
	;
}
  
  protected static void _privk3_initialize(final RegionAspectRegionAspectProperties _self_, final Region _self) {
    final Function1<Pseudostate, Boolean> _function = (Pseudostate it) -> {
      PseudostateKind _kind = it.getKind();
      return Boolean.valueOf(Objects.equal(_kind, PseudostateKind.INITIAL));
    };
    RegionAspect.currentState(_self, IterableExtensions.<Pseudostate>findFirst(Iterables.<Pseudostate>filter(_self.getSubvertex(), Pseudostate.class), _function));
    String _name = _self.getName();
    String _plus = ("Initial state of region \"" + _name);
    String _plus_1 = (_plus + "\": ");
    String _name_1 = RegionAspect.currentState(_self).getName();
    String _plus_2 = (_plus_1 + _name_1);
    Util.log(_plus_2);
  }
  
  protected static void _privk3_handleEvent(final RegionAspectRegionAspectProperties _self_, final Region _self, final EventOccurrence eventOccurrence) {
    String _name = eventOccurrence.getEvent().getName();
    String _plus = ("Handling " + _name);
    Util.log(_plus);
    StateAspect.handle(RegionAspect.currentState(_self), eventOccurrence);
    String _name_1 = _self.getName();
    String _plus_1 = ("Current state of region \"" + _name_1);
    String _plus_2 = (_plus_1 + "\": ");
    String _name_2 = RegionAspect.currentState(_self).getName();
    String _plus_3 = (_plus_2 + _name_2);
    Util.log(_plus_3);
  }
  
  protected static State _privk3_currentState(final RegionAspectRegionAspectProperties _self_, final Region _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentState") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State) ret;
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
  
  protected static void _privk3_currentState(final RegionAspectRegionAspectProperties _self_, final Region _self, final State currentState) {
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
}
