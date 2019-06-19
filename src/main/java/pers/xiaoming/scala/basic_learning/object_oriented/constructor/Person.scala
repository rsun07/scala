package pers.xiaoming.scala.basic_learning.object_oriented.constructor

class Person {
  private val name = "default_name"
  private var age = 0

  // all the non-method code belongs to default constructor
  // which is the public Person(){} in Java
  println("Default constructor is executing")

  def this(aName:String) {
    this()
    // even in another constructor, cannot modify val
    // name = aName
    println("One param constructor is executing")
  }

  def this(aName:String, ageUpdate:Int) {
    this(aName)
    println("Two param constructor is executing")
  }

  println("Default constructor's bottom print line is executing")
}
