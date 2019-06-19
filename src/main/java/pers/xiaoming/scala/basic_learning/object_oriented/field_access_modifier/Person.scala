package pers.xiaoming.scala.basic_learning.object_oriented.field_access_modifier


class Person {
  // scala auto generate getter and setter method
  var nickName = "DefaultNickName"

  // scala auto generate getter method
  val age = 0

  // need define getter and setter method
  private var firstName = "DefaultFirstName"

  // need define getter and setter method but cannot change value
  private val lastName = "DefaultLastname"

  private var rankPrivate = 1
  private[this] var rankPrivateThis = 1

  def getFirstname = firstName

  def setFirstName_=(name:String): Unit = {
    println("update first name to: " + name)
    firstName = name

    // Don't use java style
    // this.firstName = name
  }

  def getLastName = lastName

  def setLastName_=(name:String): Unit = {
    println("Cannot update last name to :" + name)
    // cannot reassign value to val
    // lastName = name
  }

  def compareRankPrivate(p:Person) = {
    rankPrivate > p.rankPrivate
  }

  def compareRankPrivateThis(p:Person) = {
    // Don't have access to private this

    // this.rankPrivateThis > p.rankPrivateThis
  }
}
