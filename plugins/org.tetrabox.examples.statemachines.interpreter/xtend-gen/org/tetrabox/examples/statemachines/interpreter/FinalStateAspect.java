package org.tetrabox.examples.statemachines.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.tetrabox.examples.statemachines.interpreter.StateAspect;
import statemachines.almostuml.FinalState;

@Aspect(className = FinalState.class)
@SuppressWarnings("all")
public class FinalStateAspect extends StateAspect {
}
