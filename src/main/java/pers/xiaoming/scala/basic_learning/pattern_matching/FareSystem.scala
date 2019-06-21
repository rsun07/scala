package pers.xiaoming.scala.basic_learning.pattern_matching

object FareSystem {
  def calculate(person:Person): Double = {
    person match {
      case Student(name, school) => printf("Student %s from %s\n", name, school); 0.5
      case Senior(name, age) => printf("Senior %s, %d old\n", name, age); 0.5
      case _ => printf("Full fare"); 1
    }
  }
}

class Person

case class Student(name:String, school:String) extends Person
case class Senior(name:String, age:Int) extends Person

