package pers.xiaoming.scala.basic_learning.functional_programming

import org.junit.Test

class WordCounterTest {
  @Test
  def test: Unit = {
    val wordCounter = new WordCounter
    wordCounter.loadFiles(List("src/test/resource/wordcount1.txt", "src/test/resource/wordcount2.txt"))
    println(wordCounter.totalNumOfWordCount)
    println

    println(wordCounter.dinstinctWordNumCount)
    println

    printIterable(wordCounter.allDistinctWordsList)

    printIterable(wordCounter.eachWordAppearanceCountMapImpl)

    printIterable(wordCounter.eachWordAppearanceCountMapViewImpl)
  }

  private def printIterable[T](list:Iterable[T]): Unit = {
    list.foreach(i => print(i + ", "))
    println
    println(list.getClass)
    println
  }
}
