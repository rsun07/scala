package pers.xiaoming.scala.basic_learning.object_oriented.inherit

import org.junit.Test

class AnonymousInnerClassDemo {

  @Test
  def test: Unit ={
    val person = new Person("Lulu", 30)
    person.show

    println

    val p = new Person("Baby", -1) {
      override def show {
        println("Show from inner class " + name)
      }
    }

    greeting(p)
  }

  private def greeting(person: Person {def show: Unit}): Unit = {
    person.show
  }
}
