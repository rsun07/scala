package pers.xiaoming.scala.basic_learning.object_oriented.inherit

class ScalaParent {
  private final val CLASS_ID = "SCALA_PARENT"

  println(CLASS_ID + " Constructor")

  private var name = ""
  val id = 0
  private[this] var address = ""

  private def getId = id

  def getIdParent = {
    println(CLASS_ID + " Get Id")
    id
  }

  def getName = {
    println(CLASS_ID + " Get Name:" + name)
    this.name
  }

  def getAddress = {
    println(CLASS_ID + " Get Address")
    this.address
  }
}
