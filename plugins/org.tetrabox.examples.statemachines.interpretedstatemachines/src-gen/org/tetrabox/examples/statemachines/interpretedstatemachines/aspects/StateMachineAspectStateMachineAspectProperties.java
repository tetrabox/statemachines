package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State;

@SuppressWarnings("all")
public class StateMachineAspectStateMachineAspectProperties {
  public State currentState;
  
  public EList<EventOccurrence> queue = new BasicEList<EventOccurrence>();
}
