package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.with_trait_and_chain

import org.junit.Test

class Demo {
  @Test
  def withDemo: Unit ={
    val requestHandler = new RequestHandler("Request")
    requestHandler.filterRequest
    println(requestHandler.getClass)

    println

    val requestHandler2 = new RequestHandler("Request2") with HttpHeaderFilter
    requestHandler2.filterRequest
    // anonymous class
    println(requestHandler2.getClass)

    println

    val requestHandler3 = new RequestHandler("Request3") with HttpContextFilter
    requestHandler3.filterRequest
    // anonymous class
    println(requestHandler3.getClass)
  }

}
