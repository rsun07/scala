package pers.xiaoming.scala.basic_learning.method_define

object PrameterDemo {
  def main(args: Array[String]): Unit = {
    printName("Mike", null, "Ben")

    printName("Mike", lastName = "Ben")

    // this is wrong, non-specific param should always behind
    // printName(lastName = "Ben", "Mike")

    printName("Firstname",  "MidName", lastName = "LastName")

    // error, message "firstName already specific"
    // printName("MidName",  firstName = "Firstname", midName = "LastName")

    // the order doesn't matter
    printName(midName = "MidName",  firstName = "Firstname", lastName = "LastName")

    // This is wrong, lastname has no default value
    // printName(midName = "MidName",  firstName = "Firstname")
  }

  def printName(firstName:String, midName:String=" ", lastName:String) {
    println(firstName + ":" + midName + ":" + lastName)
  }
}
