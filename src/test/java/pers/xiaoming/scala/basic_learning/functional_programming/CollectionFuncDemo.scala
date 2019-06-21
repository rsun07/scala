package pers.xiaoming.scala.basic_learning.functional_programming

import org.junit.Test

class CollectionFuncDemo {
  @Test
  def mapDemo: Unit = {
    val list = List("Mike", "Marry", "John", "Jane").map("Hello " + _)
    printIterable(list)
  }

  @Test
  def flatMapDemo: Unit = {
    val list = List("Hello World Mike", "Welcome to Los Angeles")

    val splitList = list.flatMap(_.split(" "))
    printIterable(splitList)

    println("\nSplit using map:")
    val splitList2 = list.map(_.split(" "))
    printIterable(splitList2)

    println
    splitList2.foreach(printIterable(_))
  }

  @Test
  def zipDemo: Unit = {
    val colon = List("Mike", "Marry", "John", "Jane").zip(List(1, 2, 3, 4))
    printIterable(colon)

    val colon2 = colon.map(i => i._2 * 2)
    printIterable(colon2)
  }

  private def printIterable[T](list:Iterable[T]): Unit = {
    list.foreach(i => print(i + ", "))
    println
    println(list.getClass)
  }
}
