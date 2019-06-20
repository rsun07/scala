package pers.xiaoming.scala.basic_learning.object_oriented.inherit

class Person(protected var name:String = "Default Name", val id:Int) {
  def show {
    println("Show " + name + ":" + id)
  }
}
