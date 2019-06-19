package pers.xiaoming.scala.basic_learning.object_oriented.inherit

class ScalaParent(private val name:String, var id:Int = 0, private[this] var address:String) {
  private final val CLASS_ID = "SCALA_PARENT"

  println(CLASS_ID + " Constructor")

  private def getId = {
    println(CLASS_ID + " Get Id")
    id
  }

  def getName = {
    println(CLASS_ID + " Get Name")
    this.name
  }

  def getAddress = {
    println(CLASS_ID + " Get Address")
    this.address
  }
}
