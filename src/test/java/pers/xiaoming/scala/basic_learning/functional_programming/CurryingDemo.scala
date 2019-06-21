package pers.xiaoming.scala.basic_learning.functional_programming

import org.junit.Test

class CurryingDemo {
  @Test
  def demo: Unit = {
    log("INFO", "Hello")

    log2("INFO2")("Hello world")

    log2("INFO3")("Hello world !")
  }

  def log(level:String, msg:String): Unit = {
    println(level + " : " + msg)
  }

  def log2(level:String) = (msg:String) => println(level + " : " + msg)

  def log3(level:String)(msg:String) = println(level + " : " + msg)
}
