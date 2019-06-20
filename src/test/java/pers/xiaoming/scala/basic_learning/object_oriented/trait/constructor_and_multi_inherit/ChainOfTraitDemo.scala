package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.constructor_and_multi_inherit

import org.junit.Test

class ChainOfTraitDemo {
  @Test
  def chainDemo: Unit = {
    // Both HttpContextFilter and HttpHeaderFilter extends Filter
    // However, Filter will be only construct once!
    val httpRequestHandler = new HttpRequestHandler("Request")
    println

    httpRequestHandler.filterRequest
  }
}
