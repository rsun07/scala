package pers.xiaoming.scala.basic_learning.object_oriented.inherit

import org.junit.Test

class ScalaInherit {

  @Test
  def test {
    val parent = new ScalaParent

    println
    val child = new ScalaChild("Name")

    println

    println(child.getName)
    println

    // Cannot access parent private method
//    println(child.getId)
//    println

    println(child.getAddress)
    println


    println(child.id)
    println(child.getIdChild)
    println(child.getIdParent)
    println

    println(child.id)
    println(child.getIdChild)
    println(child.getIdParent)
  }
}
