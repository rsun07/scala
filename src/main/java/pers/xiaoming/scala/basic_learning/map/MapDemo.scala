package pers.xiaoming.scala.basic_learning.map

object MapDemo {
  def main(args: Array[String]): Unit = {
    mapGetDemo()

    editImmutableMapElementDemo()

    editMutableMapElementDemo()
  }

  private def mapGetDemo() {
    val nameToId = Map("Mike" -> 1, "Jack" -> 2, "Jane" -> 3)
    println(nameToId("Mike"))

    println
    val notExistId = nameToId.get("Lew")
    println(notExistId)
    val jackId = if (nameToId.contains("Jack")) nameToId("Jack") else -1
    println(jackId)
    val notExistId2 = nameToId.getOrElse("NOTEXIST", -1)
    println(notExistId2)
  }

  private def editImmutableMapElementDemo() {
    val nameToId = Map("Mike" -> 1, "Jack" -> 2, "Jane" -> 3)
    println(nameToId("Mike"))

    println
    println(nameToId("Mike"))
//    nameToId("Mike") = 11
//    println(nameToId("Mike"))

    // immutable map, cannot edit
    // nameToId += ("Liu" -> 5, "Tom" -> 12)
    // nameToId -= "Mike"
    // editElementDemo(nameToId)

    var nameToId2 = Map("Mike" -> 1, "Jack" -> 2, "Jane" -> 3)
    println(nameToId("Mike"))

    println
    println(nameToId("Mike"))
//    nameToId("Mike") = 11
//    println(nameToId("Mike"))

     // even though use var to declar, map still immutable, cannot edit
//     nameToId += ("Liu" -> 5, "Tom" -> 12)
//     nameToId -= "Mike"
//     editElementDemo(nameToId)
  }

  private def editMutableMapElementDemo() {
    var nameToId = scala.collection.mutable.Map("Mike" -> 1, "Jack" -> 2, "Jane" -> 3)
    println(nameToId("Mike"))

    println
    println(nameToId("Mike"))
    nameToId("Mike") = 11
    println(nameToId("Mike"))

    nameToId += ("Liu" -> 5, "Tom" -> 12)
    nameToId -= "Mike"
    println(nameToId("Tom"))

    try {
      println(nameToId("Mike"))
    } catch {
      case e: Exception => println(e.getClass)
    }
  }
}
