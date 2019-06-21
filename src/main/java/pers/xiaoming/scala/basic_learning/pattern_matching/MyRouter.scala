package pers.xiaoming.scala.basic_learning.pattern_matching

object MyRouter {
  def route(urls:Array[String]): String = {
    urls match {
      case Array("health") => "/my/health"
      case Array("name") => "/my/name/{name}"
      case Array("class", "name") => "/my/class/{class}/name/{name}"
      case Array("class", _subpath) => "/my/class/{class}/" + _subpath
      case Array("class", _*) => "/my/class/{class}/help"
      case _ => "/404"
    }
  }

  def route(urls:List[String]): String = {
    urls match {
      case "health"::Nil => "/my/health"
      case "name"::Nil => "/my/name/{name}"
      case "name"::"class"::Nil => "/my/class/{class}/name/{name}"
      case "class"::_subpath::Nil => "/my/class/{class}/" + _subpath
      case "class"::tail => "/my/class/{class}" + tail.toString()
      case _ => "/404"
    }
  }
}
