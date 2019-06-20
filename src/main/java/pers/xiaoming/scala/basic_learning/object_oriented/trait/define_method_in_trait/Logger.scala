package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.define_method_in_trait

trait Logger {
  def log(level:String, msg:String) = println("Log : " + level + " : " + msg)
}
