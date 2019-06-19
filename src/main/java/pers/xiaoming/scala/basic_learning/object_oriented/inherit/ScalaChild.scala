package pers.xiaoming.scala.basic_learning.object_oriented.inherit

class ScalaChild(name:String, id:Int, address:String) extends ScalaParent(name:String, id:Int, address:String)  {
  private final val CLASS_ID = "SCALA_Child"

  private var typeOfClass = ""

  println(CLASS_ID + " Constructor")

  override def getName: String = {
    println(CLASS_ID + " Get Name")
    // inaccessible
    // super.name

    super.getName
  }

  override def getAddress = {
    println(CLASS_ID + " Get Address")
    this.address
  }
}
