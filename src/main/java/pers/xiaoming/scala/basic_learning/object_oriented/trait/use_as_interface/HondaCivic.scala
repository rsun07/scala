package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.use_as_interface

class HondaCivic extends Car with Brand {
  override def run(): Unit = {
    println("Car is running")
  }

  override def showBrandName(): Unit = {
    println("Brand is Honda")
  }
}
