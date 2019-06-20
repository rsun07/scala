package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.early_define

trait LoggerLazy {
  lazy val defaultLevel:String = null

  println("In LoggerLazy trait constructor, Default level is: " + defaultLevel.toString)
}
