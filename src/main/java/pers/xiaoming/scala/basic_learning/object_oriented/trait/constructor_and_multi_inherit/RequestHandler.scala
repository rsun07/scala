package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.constructor_and_multi_inherit

class RequestHandler(request:String) extends Filter {
  println("Constructor of RequestHandler")

  def filterRequest {
    println("Executing request handler")
    filter(request)
  }
}
