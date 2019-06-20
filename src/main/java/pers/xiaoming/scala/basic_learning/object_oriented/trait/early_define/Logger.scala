package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.early_define

// trait cannot accept parameter in constructor
// So use early define to fill abstract field
trait Logger {
  val defaultLevel:String

  println("In Logger trait constructor, Default level is: " + defaultLevel.toString)
}
