package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.early_define

class MyLoggerEarlyDefine extends {val defaultLevel:String = "info"} with Logger {
  println("In MyLoggerEarlyDefine class constructor, Default level is: " + defaultLevel.toString)
}
