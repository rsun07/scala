package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.class_inherit_trait

trait ExtendedTrait extends BaseClass {
  val traitName = "Trait Name"
  val traitValue = 2

  def printTrait {
    println("Trait print, " + traitValue)
  }
}
