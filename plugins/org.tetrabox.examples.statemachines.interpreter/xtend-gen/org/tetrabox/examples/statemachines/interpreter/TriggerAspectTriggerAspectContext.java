package org.tetrabox.examples.statemachines.interpreter;

import java.util.Map;
import org.tetrabox.examples.statemachines.interpreter.TriggerAspectTriggerAspectProperties;
import statemachines.almostuml.Trigger;

@SuppressWarnings("all")
public class TriggerAspectTriggerAspectContext {
  public final static TriggerAspectTriggerAspectContext INSTANCE = new TriggerAspectTriggerAspectContext();
  
  public static TriggerAspectTriggerAspectProperties getSelf(final Trigger _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.examples.statemachines.interpreter.TriggerAspectTriggerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Trigger, TriggerAspectTriggerAspectProperties> map = new java.util.WeakHashMap<statemachines.almostuml.Trigger, org.tetrabox.examples.statemachines.interpreter.TriggerAspectTriggerAspectProperties>();
  
  public Map<Trigger, TriggerAspectTriggerAspectProperties> getMap() {
    return map;
  }
}
