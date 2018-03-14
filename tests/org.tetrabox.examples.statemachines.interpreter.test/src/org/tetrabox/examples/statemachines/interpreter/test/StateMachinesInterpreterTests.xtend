package org.tetrabox.examples.statemachines.interpreter.test

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.Test
import statemachines.CustomSystem

import static extension org.tetrabox.examples.statemachines.interpreter.CustomSystemAspect.*

class StateMachinesInterpreterTests {

	private def void test(String model, String... events) {
		val ResourceSet rs = new ResourceSetImpl
		val resource = rs.getResource(URI::createFileURI(model), true)
		val system = resource.contents.head as CustomSystem
		system.initialize(events)
		system.main
	}

	@Test
	def void test1() {
		test("models/test1.xmi", "x")
	}

	@Test
	def void test2() {
		test("models/test2.xmi", "x", "y", "x")
	}

}
