package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.class_inherit_trait

class ExtendedClass extends ExtendedTrait {
  def printExtendedClass {
    super.printBase
    super.printTrait

    println("ExtendedClass print, super values", name, traitValue)
    println
  }
}
