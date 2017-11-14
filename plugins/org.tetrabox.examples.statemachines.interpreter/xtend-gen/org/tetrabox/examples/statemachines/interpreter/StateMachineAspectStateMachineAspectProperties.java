package org.tetrabox.examples.statemachines.interpreter;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import statemachines.almostuml.State;
import statemachinesexecutiondata.EventOccurrence;

@SuppressWarnings("all")
public class StateMachineAspectStateMachineAspectProperties {
  public State currentState;
  
  public EList<EventOccurrence> queue = new BasicEList<EventOccurrence>();
}
