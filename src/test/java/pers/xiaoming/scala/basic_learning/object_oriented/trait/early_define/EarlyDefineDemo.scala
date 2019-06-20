package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.early_define

import org.junit.Test

class EarlyDefineDemo {

  @Test (expected = classOf[NullPointerException])
  def nullPointerDemo {
    val logger = new MyLogger
  }

  @Test
  def earlyDefine: Unit = {
    val logger = new {override val defaultLevel:String = "error"} with MyLogger
    println(logger.defaultLevel)
  }

  @Test
  def earlyDefineInClass: Unit = {
    val logger = new MyLoggerEarlyDefine
  }

  @Test
  def lazyValue: Unit = {
    val logger = new MyLoggerLazy
  }
}
