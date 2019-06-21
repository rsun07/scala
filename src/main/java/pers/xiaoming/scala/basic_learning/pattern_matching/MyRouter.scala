package pers.xiaoming.scala.basic_learning.pattern_matching

object MyRouter {
  def route(urls:Array[String]): String = {
    urls match {
      case Array("health") => "/my/health"
      case Array("name") => "/my/name/{name}"
      case Array("name", "class") => "/my/class/{class}/name/{name}"
      case Array("class", _*) => "/my/class/{class}"
      case _ => "/404"
    }
  }
}
