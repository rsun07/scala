package pers.xiaoming.scala.basic_learning.collection.hello_world.map

object SpecialMaps {
  def main(args: Array[String]): Unit = {
    val sortedMap = scala.collection.immutable.SortedMap("Mike" -> 1, "Jack" -> 2, "Jane" -> 3)
    for((key, value) <- sortedMap) println(key + ":" + value)

    println
    val linkedHashMap = scala.collection.mutable.LinkedHashMap("Mike" -> 1, "Jack" -> 2, "Jane" -> 3)
    for((key, value) <- linkedHashMap) println(key + ":" + value)
  }
}
