package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.define_field_and_method_in_trait

class Engineer(val aName:String) extends Worker with Logger {
  // override could be omitted
  val name: String = aName

  override def work(work: String): Unit = {
    super.work(work)
    log(level = "info", msg = "More log from Engineer Class, all worker base salary is " + baseSalary)
  }
}
