package pers.xiaoming.scala.basic_learning.pattern_matching

import java.io.IOException

object MyExceptionMapper {
  def mapper(e:Exception): Unit = {
    e match {
      case e:RuntimeException => println("Runtime Exception" + e.getMessage)
      case e:IOException => println("IOException" + e.getMessage)
      case _e:Throwable => println("Other unknown exception" + _e.getMessage)
    }
  }
}
