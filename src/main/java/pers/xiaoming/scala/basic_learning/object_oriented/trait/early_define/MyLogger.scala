package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.early_define

class MyLogger extends Logger {
  override val defaultLevel: String = "Info"

  println("In MyLogger class constructor, Default level is: " + defaultLevel.toString)
}
