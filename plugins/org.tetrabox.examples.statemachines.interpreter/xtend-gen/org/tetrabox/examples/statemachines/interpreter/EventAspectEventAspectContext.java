package org.tetrabox.examples.statemachines.interpreter;

import java.util.Map;
import org.tetrabox.examples.statemachines.interpreter.EventAspectEventAspectProperties;
import statemachines.almostuml.Event;

@SuppressWarnings("all")
public class EventAspectEventAspectContext {
  public final static EventAspectEventAspectContext INSTANCE = new EventAspectEventAspectContext();
  
  public static EventAspectEventAspectProperties getSelf(final Event _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.examples.statemachines.interpreter.EventAspectEventAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Event, EventAspectEventAspectProperties> map = new java.util.WeakHashMap<statemachines.almostuml.Event, org.tetrabox.examples.statemachines.interpreter.EventAspectEventAspectProperties>();
  
  public Map<Event, EventAspectEventAspectProperties> getMap() {
    return map;
  }
}
