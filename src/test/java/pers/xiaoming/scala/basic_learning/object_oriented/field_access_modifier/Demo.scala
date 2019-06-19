package pers.xiaoming.scala.basic_learning.object_oriented.field_access_modifier

import org.junit.Test

class Demo {
  @Test
  def test() {
    val person = new Person

    printPerson(person)

    // age is val
    // person.age = 20

    println
    person.nickName = "UpdatedNickname"
    person.setFirstName_=("UpdatedFirstName")
    person.setLastName_=("UpdatedLastName")

    printPerson(person)
  }

  def printPerson(person:Person): Unit = {
    println
    println(person.age)
    println(person.nickName)

    // cannot use this getter, not defined
    // println(person.firstName)

    println(person.getFirstname)
    println(person.getLastName)
  }

}
