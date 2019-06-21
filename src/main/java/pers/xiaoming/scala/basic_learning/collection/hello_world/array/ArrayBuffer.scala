package pers.xiaoming.scala.basic_learning.collection.hello_world.array

import scala.collection.mutable.ArrayBuffer

object ArrayBuffer {
  def main(args: Array[String]): Unit = {
    val arrayBuffer = new ArrayBuffer[Int]()

    arrayBuffer += 10
    LoopArray.loopAndPrint("After add one element", arrayBuffer.toArray)

    arrayBuffer += (20, 30, 60)
    LoopArray.loopAndPrint("After add three element", arrayBuffer.toArray)

    arrayBuffer ++= Array(70, 80, 90, 80, 70, 60)
    LoopArray.loopAndPrint("After concat with another array", arrayBuffer.toArray)

    // (index, element)
    arrayBuffer.insert(3, 100)
    LoopArray.loopAndPrint("After insert(3, 100)", arrayBuffer.toArray)

    arrayBuffer.trimEnd(2)
    LoopArray.loopAndPrint("After trimEnd(2)", arrayBuffer.toArray)

    arrayBuffer.remove(2)
    LoopArray.loopAndPrint("After remove(2)", arrayBuffer.toArray)

    arrayBuffer.remove(2, 3)
    LoopArray.loopAndPrint("After remove(2, 3)", arrayBuffer.toArray)
    LoopArray.loopAndPrintReverse("Reverse print", arrayBuffer.toArray)
  }
}
