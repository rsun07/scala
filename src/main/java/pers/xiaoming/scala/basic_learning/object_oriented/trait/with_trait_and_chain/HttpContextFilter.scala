package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.with_trait_and_chain

trait HttpContextFilter extends Filter {
  override def filter(request: String) {
    println("Filtering context")
    super.filter(request)
  }
}
