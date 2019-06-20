package pers.xiaoming.scala.basic_learning.object_oriented.inherit

class ScalaChild extends ScalaParent  {
  private final val CLASS_ID = "SCALA_Child"

  // mutable variable cannot be overridden
  // override var id = 1

  override val id = 2

  private var typeOfClass = ""

  println(CLASS_ID + " Constructor")

  def this(aName:String) {
    this()
    // no access to super name
    // name = aName
    println(CLASS_ID + " One Param Constructor")
  }

  override def getName: String = {
    println(CLASS_ID + " Get Name: " + super.getName)
    // inaccessible
    // super.name

    super.getName
  }

  override def getAddress = {
    println(CLASS_ID + " Get Address")
    super.getAddress
  }

  def getIdChild =  {
    println(CLASS_ID + " Get id")
    id
  }
}
