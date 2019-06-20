package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.constructor_and_multi_inherit

trait HttpHeaderFilter extends Filter {
  println("Constructor of HttpHeaderFilter")

  override def filter(request: String) {
    println("Filtering header")
    super.filter(request)
  }
}
