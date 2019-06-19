package pers.xiaoming.scala.basic_learning.object_oriented.constructor

import org.junit.Test

class Demo {
  @Test
  def test {
    val person = new Person

    println

    val person2 = new Person("Jane")

    println

    val person3 = new Person("Mike", 18)
  }
}
