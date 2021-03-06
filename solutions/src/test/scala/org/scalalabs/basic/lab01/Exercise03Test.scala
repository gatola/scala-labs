package org.scalalabs.basic.lab01

import org.scalatest._
import junit.{JUnitSuite}
import org.junit.Test

/*
 * Beginner Hello World:
 * 
 * Scala Classes and companion Objects
 *
 * Your job is to implement the objects and classes in
 * such a way that the tests in this suite all succeed.
 * 
 * Hint: 
 * - A Class may have a companion Ojbect by the same name, defined
 *   in the same source file
 * - An Object can be constructed using an apply method
 */

class Exercise03Test extends JUnitSuite {
    @Test def testInstanceIsCreatedByCompanion() {
      val helloWorldInstance = HelloWorldClassAndObject("Hello")
      assert("Hello" === helloWorldInstance.echo)
    }
}
