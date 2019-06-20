package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.constructor_and_multi_inherit

// when executing, it's from right to left
// ContextFilter first then HeaderFilter
class HttpRequestHandler(request:String) extends HttpHeaderFilter with HttpContextFilter {
  println("Constructor of HttpRequestHandler")

  def filterRequest {
    println("Executing http request handler")
    filter(request)
  }
}
