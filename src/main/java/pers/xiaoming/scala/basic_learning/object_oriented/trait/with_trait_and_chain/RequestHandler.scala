package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.with_trait_and_chain

class RequestHandler(request:String) extends Filter {
  def filterRequest {
    println("Executing request handler")
    filter(request)
  }
}
