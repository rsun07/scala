package pers.xiaoming.scala.basic_learning.functional_programming

class WordCounter {
  private var contexts:StringBuilder = new StringBuilder
  private var wordList:Array[String] = _

  def loadFiles(fileNames:List[String]): Unit = {
    fileNames.foreach(name => {
      val context = scala.io.Source.fromFile(name).mkString
      contexts.append(context)
      contexts.append("\n")
    })
    wordList = contexts.toString().split("[\\\t|\\\n|\\\r|\" \"]")
  }

  def totalNumOfWordCount: Int = {
    wordList.map((_,1)).map(_._2).reduceLeft(_+_)
    // wordList.count(_ => true)
  }

  def eachWordAppearanceCountMapImpl: Map[String, Int] = {
    val wordToAppearanceArray:Map[String, Array[String]] = wordList.groupBy((word:String) => word)

    // Multiple ways to convert the map into a new map
    wordToAppearanceArray.map{ case (word:String, array:Array[String]) => (word, array.length)}
  }

  def eachWordAppearanceCountMapViewImpl: Map[String, Int] = {
    val wordToAppearanceArray:Map[String, Array[String]] = wordList.groupBy((word:String) => word)

    // Multiple ways to convert the map into a new map
    wordToAppearanceArray.view.mapValues(_.length).toMap
  }

  def allDistinctWordsList: Array[String] = {
    wordList.distinct
  }

  def dinstinctWordNumCount: Int = {
    wordList.distinct.count(_ => true)
  }
}
