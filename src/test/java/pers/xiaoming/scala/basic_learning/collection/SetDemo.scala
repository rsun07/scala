package pers.xiaoming.scala.basic_learning.collection

import org.junit.Test

import scala.collection.mutable

class SetDemo {
  @Test
  def setDemo {
    val set = Set(1, 2, 3)
    printSet(set)

    //val set2 = set.concat("A")
    //printSet(set2)

    val set3 = mutable.HashSet(1, 2, 3, 5, "A", "D")
    set3.add("S")
    set3.remove(3)
    printSet(set3)
  }

  private def  printSet[T](set:Iterable[T]): Unit = {
    set.foreach(i => print(i + ","))
    println
    println(set.getClass)
    println
  }
}
