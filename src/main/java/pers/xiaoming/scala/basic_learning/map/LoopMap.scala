package pers.xiaoming.scala.basic_learning.map

object LoopMap {
  def main(args: Array[String]): Unit = {
    val nameToId = Map("Mike" -> 1, "Jack" -> 2, "Jane" -> 3)

    for((key, value) <- nameToId) println(key + ":" + value)

    println
    for(key <- nameToId.keySet) println(key)

    println
    for(value<- nameToId.values) println(value)

    val idToName = for((key, value) <- nameToId) yield (value, key)
    println(idToName.getClass)
    for((key, value) <- idToName) println(key, value) //println(key + ":" + value) error

  }
}
