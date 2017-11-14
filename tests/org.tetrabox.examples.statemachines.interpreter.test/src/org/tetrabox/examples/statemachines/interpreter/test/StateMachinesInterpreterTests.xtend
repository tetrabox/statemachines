package org.tetrabox.examples.statemachines.interpreter.test

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.Test
import statemachines.CustomSystem

import static extension org.tetrabox.examples.statemachines.interpreter.CustomSystemAspect.*

class StateMachinesInterpreterTests {

	@Test
	def void yay() {
		val ResourceSet rs = new ResourceSetImpl
		val resource = rs.getResource(URI::createFileURI("models/test1.xmi"), true)
		val system = resource.contents.head as CustomSystem
		system.run(#["x"])
	}

}
