package pers.xiaoming.scala.basic_learning.array

object ArrayDemo {
  def main(args: Array[String]): Unit = {
    val arrayInt = new Array[Int](10)
    println(arrayInt(0))
    arrayInt(0) = 1
    println(arrayInt(0))

    val arrayAny = Array("leo", 0, 2.0)
    arrayAny.foreach(println)
  }
}
