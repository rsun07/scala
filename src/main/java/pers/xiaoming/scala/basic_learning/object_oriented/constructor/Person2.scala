package pers.xiaoming.scala.basic_learning.object_oriented.constructor

class Person2(val name:String, var age:Int = 1) {
  println("Person2 class constructor is executing")

  private val classPrivateVal = "Class Private Val"
  private[this] val classPrivateThisVal = "Class Private This Val"

  val privateVal = Person2.objectPrivateVal

  // cannot access private this
  // val privateThisVal = Person2.objectPrivateThisVal

  println("Person2 class get object private val : " + privateVal)
}

// companion object
object Person2 {
  println("Person2 object constructor is executing")

  private val objectPrivateVal = "Object Private Val"
  private[this] val objectPrivateThisVal = "Object Private This Val"

  // cannot access private from class
  // Person2.classPrivateVal

  def apply(name:String) = new Person2(name)
  def apply(name:String, age:Int) = new Person2(name, age)
}
