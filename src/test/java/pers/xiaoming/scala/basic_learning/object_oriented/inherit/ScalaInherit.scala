package pers.xiaoming.scala.basic_learning.object_oriented.inherit

import org.junit.Test

class ScalaInherit {

  @Test
  def test {
    val parent = new ScalaParent("Mike", 2, "")

    println
    val child = new ScalaChild("Mike", 2, "")

    println

    println(child.getName)
    println

    println(child.getId)
    println

    println(child.getAddress)
    println
  }
}
