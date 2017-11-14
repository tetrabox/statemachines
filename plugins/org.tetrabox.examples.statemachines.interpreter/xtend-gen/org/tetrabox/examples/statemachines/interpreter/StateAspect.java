package org.tetrabox.examples.statemachines.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.tetrabox.examples.statemachines.interpreter.StateAspectStateAspectProperties;
import statemachines.almostuml.State;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  public static State handle(final State _self, final Object eventOccurrence) {
    final org.tetrabox.examples.statemachines.interpreter.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpreter.StateAspectStateAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof statemachines.almostuml.Pseudostate){
    					result = org.tetrabox.examples.statemachines.interpreter.PseudostateAspect.handle((statemachines.almostuml.Pseudostate)_self,eventOccurrence);
    } else  if (_self instanceof statemachines.almostuml.State){
    					result = org.tetrabox.examples.statemachines.interpreter.StateAspect._privk3_handle(_self_, (statemachines.almostuml.State)_self,eventOccurrence);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (statemachines.almostuml.State)result;
  }
  
  protected static State _privk3_handle(final StateAspectStateAspectProperties _self_, final State _self, final Object eventOccurrence) {
    try {
      throw new Exception(("handle must be overridden for managing : " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
