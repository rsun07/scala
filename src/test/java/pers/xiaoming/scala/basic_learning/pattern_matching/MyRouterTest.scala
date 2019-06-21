package pers.xiaoming.scala.basic_learning.pattern_matching

import org.junit.{Assert, Test}

class MyRouterTest {
  @Test
  def arrayTest: Unit = {
    Assert.assertEquals("/my/health", MyRouter.route(Array("health")))
    Assert.assertEquals("/404", MyRouter.route(Array("health", "name")))

    Assert.assertEquals("/my/name/{name}", MyRouter.route(Array("name")))
    Assert.assertEquals("/my/class/{class}/name/{name}", MyRouter.route(Array("class", "name")))
    Assert.assertEquals("/my/class/{class}/teacher", MyRouter.route(Array("class", "teacher")))
    Assert.assertEquals("/my/class/{class}/room", MyRouter.route(Array("class", "room")))
    Assert.assertEquals("/my/class/{class}/help", MyRouter.route(Array("class", "name", "teacher")))
    Assert.assertEquals("/my/class/{class}/help", MyRouter.route(Array("class", "teacher", "room")))
    Assert.assertEquals("/my/class/{class}/help", MyRouter.route(Array("class", "random1", "random2")))

    Assert.assertEquals("/404", MyRouter.route(Array("name", "class")))
    Assert.assertEquals("/404", MyRouter.route(Array("random1")))
    Assert.assertEquals("/404", MyRouter.route(Array("random1", "random2")))
  }
}
