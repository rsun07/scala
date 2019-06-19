package pers.xiaoming.scala.basic_learning.map

object TupleDemo {
  def main(args: Array[String]): Unit = {
    val nameToId = Map("Mike" -> 1, "Jack" -> 2)

    for(tuple <- nameToId) {
      println(tuple.getClass)
      println("toString()" + tuple.toString())
      println("._1, ._2 result: ", tuple._1, tuple._2)
      println
    }

    println
    val names = Array("Mike", "Marry", "John")
    val ids = Array(1, 2, 3)
    val nameToId2 = names.zip(ids)
    for((key, value) <- nameToId2) println(key + ":" + value)
  }
}
