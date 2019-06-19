package pers.xiaoming.scala.basic_learning.object_oriented.constructor

import org.junit.Test

class Demo {
  @Test
  def testConstructor {
    val person = new Person

    println

    val person2 = new Person("Jane")

    println

    val person3 = new Person("Mike", 18)
  }

  @Test
  def testCompanionObject {
    val person = new Person2("Jane")

    println

    val person2 = Person2.apply("Jane")

    println


    val person3 = Person2.apply("Mike", 18)
  }
}
