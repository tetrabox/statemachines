package org.tetrabox.examples.statemachines.interpreter;

import java.util.Map;
import org.tetrabox.examples.statemachines.interpreter.CustomSystemAspectCustomSystemAspectProperties;
import statemachines.CustomSystem;

@SuppressWarnings("all")
public class CustomSystemAspectCustomSystemAspectContext {
  public final static CustomSystemAspectCustomSystemAspectContext INSTANCE = new CustomSystemAspectCustomSystemAspectContext();
  
  public static CustomSystemAspectCustomSystemAspectProperties getSelf(final CustomSystem _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.examples.statemachines.interpreter.CustomSystemAspectCustomSystemAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<CustomSystem, CustomSystemAspectCustomSystemAspectProperties> map = new java.util.WeakHashMap<statemachines.CustomSystem, org.tetrabox.examples.statemachines.interpreter.CustomSystemAspectCustomSystemAspectProperties>();
  
  public Map<CustomSystem, CustomSystemAspectCustomSystemAspectProperties> getMap() {
    return map;
  }
}
