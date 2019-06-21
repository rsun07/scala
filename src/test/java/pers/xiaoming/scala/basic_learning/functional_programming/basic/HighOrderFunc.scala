package pers.xiaoming.scala.basic_learning.functional_programming.basic

import org.junit.Test

class HighOrderFunc {

  @Test
  def demo: Unit = {
    val array = Array(1 to 5: _*).map(2*_)
  }
}
