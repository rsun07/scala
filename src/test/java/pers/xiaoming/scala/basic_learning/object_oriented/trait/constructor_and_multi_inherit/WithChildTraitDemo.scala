package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.constructor_and_multi_inherit

import org.junit.Test

class WithChildTraitDemo {
  @Test
  def demo: Unit ={
    val requestHandler = new RequestHandler("Request")
    println
    requestHandler.filterRequest
    println(requestHandler.getClass)

    println

    val requestHandler2 = new RequestHandler("Request2") with HttpHeaderFilter
    println
    requestHandler2.filterRequest
    // anonymous class
    println(requestHandler2.getClass)

    println

    val requestHandler3 = new RequestHandler("Request3") with HttpContextFilter
    println
    requestHandler3.filterRequest
    // anonymous class
    println(requestHandler3.getClass)
  }
}
