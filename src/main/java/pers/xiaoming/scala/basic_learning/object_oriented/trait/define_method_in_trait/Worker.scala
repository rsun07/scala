package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.define_method_in_trait

class Worker extends Logger {
  def work(work:String): Unit = {
    val msg = "Worker is working on :" + work
    println("Worker is working on :" + work)
    log("info", msg)
  }
}
