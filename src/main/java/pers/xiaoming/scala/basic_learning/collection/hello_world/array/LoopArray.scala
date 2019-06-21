package pers.xiaoming.scala.basic_learning.collection.hello_world.array

// Works for both Array and ArrayBuffer
object LoopArray {
  def loopAndPrint[T](msg:String, array: Array[T]) {
    println("\n" + msg)
    for (x <- array) print(x + ", ")
    println
  }

  def loopAndPrintMoreWays[T]( array: Array[T]) {
    for (i <- 0 to array.length - 1) print(array(i) + ", ")
    println
    for (i <- 0 until array.length) print(array(i) + ", ")
    println
    for (i <- array.indices) print(array(i) + ", ")
    println
  }

  def loopAndPrintReverse[T](msg:String, array: Array[T]): Unit = {
    println("\n" + msg)
    for (i <- array.indices.reverse) print(array(i) + ", ")
    println
  }
}
