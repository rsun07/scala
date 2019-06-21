package pers.xiaoming.scala.basic_learning.functional_programming.basic

import org.junit.Test

class HighOrderFunc {

  @Test
  def demo: Unit = {
    val array = Array(1 to 5: _*).map(2*_)
    array.foreach(i => print(i + ","))

    println
    (1 to 10).filter(_ % 2 == 0).map(_ * 10 + ",").foreach(print)
  }

  @Test
  def reduceDemo: Unit = {
    println
    val product = (1 to 5).product
    val product2 = (1 to 5).reduce(_ * _)
    println("produce, product2", product, product2)

    println
    val charArray = Array("a", "b", "c", "d")
    val result = charArray.reduce(_ + " " + _)
    val leftResult = charArray.reduceLeft(_ + " " + _)
    val rightResult = charArray.reduceRight(_ + " " + _)
    printf("result: <%s>, left result: <%s>, right result: <%s>", result, leftResult, rightResult)
  }

  @Test
  def sortWithDemo: Unit = {
    val array = Array(3, 5, 8, 6, 2, 7)
    array.sortWith(_ < _).foreach(i => print(i + ","))

    println
    array.sortWith(_ > _).foreach(i => print(i + ","))
  }
}
