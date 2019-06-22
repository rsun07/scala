package pers.xiaoming.scala.basic_learning.implicit_transform

class Student(val name:String) {
  def exam(examName:String) = printf("%s is taking %s exam", name, examName)
}

class Senior(val name:String)
class Adult(val name:String)
class Disabled(val name:String)
class DiscountEligiblePerson(val name:String, val discount:Double)
