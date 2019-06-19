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

  @Test
  def instanceOfDemo {
    val child:ScalaParent = new ScalaChild

    println(child.isInstanceOf[ScalaParent])
    println(child.isInstanceOf[ScalaChild])

    if (child.isInstanceOf[ScalaChild]) child.asInstanceOf[ScalaChild]
  }

  @Test
  def classOfDemo {
    val child:ScalaParent = new ScalaChild

    println(child.getClass)
    println(child.getClass == classOf[ScalaChild])
    println(child.getClass == classOf[ScalaParent])
  }

  @Test
  def patternMatchDemo {
    val child:ScalaParent = new ScalaChild

    child match {
      case parent:ScalaParent => println("Scala Parent class")
      case child:ScalaChild => println("Scala Child class")
      case _ => println("Unknown class")
    }
  }
}
