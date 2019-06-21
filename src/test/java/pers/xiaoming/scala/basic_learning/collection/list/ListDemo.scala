package pers.xiaoming.scala.basic_learning.collection.list

import org.junit.Test

class ListDemo {
  @Test
  def basicDemo: Unit = {
    // creation
    val list = List(1, 2, 3, 4, 5)
    printList(list)

    println("list head :", list.head)
    println("list tail :", list.tail)

    val list2 = 0::list
    printList(list2)
    println("list2 head :", list2.head)
    println("list2 tail :", list2.tail)
    // cannot use like this
    // val list3 = list::6
  }

  private def printList(list:List[Int]): Unit = {
    list.foreach(i => print(i + ","))
    println
  }

  @Test
  def oneElementList: Unit = {
    val list = List(1)
    println("list head :", list.head)
    println("list tail :", list.tail)
  }

  @Test
  def recursivelyLoopList: Unit = {
    val list = List(1, 2, 3, 4, 5)

    val newList = recursivelyTimeTen(list)
    printList(newList)
  }

  private def recursivelyTimeTen(list: List[Int]): List[Int] = {
    if (list != Nil) {
      printf("current head is:%d, time ten result, %d\n", list.head, list.head * 10)
      val newList = recursivelyTimeTen(list.tail)
      return list.head * 10 :: newList
    } else {
      return List[Int]()
    }
  }
}
