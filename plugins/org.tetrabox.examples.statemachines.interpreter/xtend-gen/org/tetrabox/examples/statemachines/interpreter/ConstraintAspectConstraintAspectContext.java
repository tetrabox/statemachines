package org.tetrabox.examples.statemachines.interpreter;

import java.util.Map;
import org.tetrabox.examples.statemachines.interpreter.ConstraintAspectConstraintAspectProperties;
import statemachines.almostuml.Constraint;

@SuppressWarnings("all")
public class ConstraintAspectConstraintAspectContext {
  public final static ConstraintAspectConstraintAspectContext INSTANCE = new ConstraintAspectConstraintAspectContext();
  
  public static ConstraintAspectConstraintAspectProperties getSelf(final Constraint _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.examples.statemachines.interpreter.ConstraintAspectConstraintAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Constraint, ConstraintAspectConstraintAspectProperties> map = new java.util.WeakHashMap<statemachines.almostuml.Constraint, org.tetrabox.examples.statemachines.interpreter.ConstraintAspectConstraintAspectProperties>();
  
  public Map<Constraint, ConstraintAspectConstraintAspectProperties> getMap() {
    return map;
  }
}
