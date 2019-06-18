package pers.xiaoming.scala.basic_learning.condition_and_loop

object BasicForLoop {
  def main(args: Array[String]): Unit = {
    println("\n1 to n:")
    var n = 10; for(i <- 1 to n) print(i + " ")

    println("\n\n1 until n:")
    for(i <- 1 until n) print(i + " ")

    println("\n\nn until 1:")
    for(i <- n until 1 by -1) print(i + " ")

    println("\nn to 1:")
    for(i <- n to 1 by -1) print(i + " ")

    println("\n\nloop chars in string:")
    for(c <- "Hello World") print(c + " ")

    println("\n\nEven number using if:")
    for(i <- 1 to 10 if i % 2== 0) print(i + " ")

    println("\n\nOdd number using by 2:")
    for(i <- 1 to 10 by 2) print(i + " ")

    println("\n\nOdd number using by 2 yield to vector:")
    val list = for(i <- 1 to 10 by 2) yield i
    print(list + " " + list.getClass)
  }
}
