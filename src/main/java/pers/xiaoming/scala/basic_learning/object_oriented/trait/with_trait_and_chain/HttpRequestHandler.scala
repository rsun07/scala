package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.with_trait_and_chain

class HttpRequestHandler(request:String) extends HttpHeaderFilter with HttpContextFilter {
  def filterRequest {
    println("Executing http request handler")
    filter(request)
  }
}
