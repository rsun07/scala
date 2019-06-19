package pers.xiaoming.scala.basic_learning.array

object ArrayTransform {
  def main(args: Array[String]): Unit = {
    val nums = (1 to 10).toArray
    LoopArray.loopAndPrint("After creation:" , nums)

    val squareNums = for(num <- nums) yield num * num
    LoopArray.loopAndPrint("After square:" , squareNums)

    val oddNums = for(num <- nums if num % 2 != 0) yield num
    LoopArray.loopAndPrint("Odd number:" , oddNums)

    // using functional programming
    val evenNums = nums.filter(_ % 2 == 0)
    LoopArray.loopAndPrint("Even number:" , evenNums)
  }
}
