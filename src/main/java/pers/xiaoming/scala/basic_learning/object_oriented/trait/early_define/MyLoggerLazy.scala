package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.early_define

class MyLoggerLazy extends LoggerLazy {
  override lazy val defaultLevel: String = "Info"

  println("In MyLoggerLazy class constructor, Default level is: " + defaultLevel.toString)
}
