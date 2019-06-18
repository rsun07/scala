package pers.xiaoming.scala.basic_learning.array

// Works for both Array and ArrayBuffer
object LoopArray {
  def loopAndPrint(msg:String, array: Array[Any]) {
    println("\n" + msg)
    for (x <- array) print(x + ", ")
    println
  }

  def loopAndPrintMoreWays( array: Array[Any]) {
    for (i <- 0 to array.length - 1) print(array(i) + ", ")
    println
    for (i <- 0 until array.length) print(array(i) + ", ")
    println
    for (i <- array.indices) print(array(i) + ", ")
    println
  }

  def loopAndPrintReverse(msg:String, array: Array[Any]): Unit = {
    println("\n" + msg)
    for (i <- array.indices.reverse) print(array(i) + ", ")
    println
  }
}
