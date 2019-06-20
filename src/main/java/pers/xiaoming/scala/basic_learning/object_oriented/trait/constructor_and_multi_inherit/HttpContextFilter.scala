package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.constructor_and_multi_inherit

trait HttpContextFilter extends Filter {
  println("Constructor of HttpContextFilter")

  override def filter(request: String) {
    println("Filtering context")
    super.filter(request)
  }
}
