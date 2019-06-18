package pers.xiaoming.scala.basic_learning.condition_and_loop

object BasicCondition {
  def main(args: Array[String]): Unit = {
    var age = 30
    val isAdult = if (age > 21) true else false
    print(isAdult)

    val isAdult2 = if (age > 21) "Yes" else false
    print(isAdult2)

    age = 15; val isAdult3 = if (age > 21) "Yes" else false; print(isAdult3)

    println
    longer_condition
  }

  def print(isAdult:Any): Unit = {
    println("Is adult: " + isAdult + " (" + isAdult.getClass + ")")
  }

  def longer_condition: Unit = {
    var a,b,c = 0
    if (a < 1) {
      b += 1
      c += 2
    } else if (a == 0) {
      b = b + c
      c = b * c
    }
    println(a, b, c)
  }
}
