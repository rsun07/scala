package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.define_field_and_method_in_trait

trait Worker extends Logger {
  // abstract field in trait
  // doesn't allow in class
  val name:String

  // like a constant in Java
  val baseSalary = 10

  def work(work:String): Unit = {
    val msg = "Worker is working on :" + work
    println("Worker is working on :" + work)
    log("info", msg)
  }
}
