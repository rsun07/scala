package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.with_trait_and_chain

// when executing, it's from right to left
// ContextFilter first then HeaderFilter
class HttpRequestHandler(request:String) extends HttpHeaderFilter with HttpContextFilter {
  def filterRequest {
    println("Executing http request handler")
    filter(request)
  }
}
