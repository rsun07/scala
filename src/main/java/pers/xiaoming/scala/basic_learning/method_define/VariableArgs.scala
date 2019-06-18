package pers.xiaoming.scala.basic_learning.method_define

object VariableArgs {
  def main(args: Array[String]) {
    println(sum(1, 2, 3, 4, 5))
    println(sumWrong(1, 2, 3, 4, 5))
    println(sumVerbose(1, 2, 3, 4, 5))

    // this is wrong, method sum() accept variable integers rather than a Range(1 to 5)
    // println(sum(1 to 5))
    // use this instead
    println(sum(1 to 5 : _*))
    println(sumRecursive(1 to 5 : _*))
  }

  def sum(nums: Int*) = {
    var sum = 0; for(num <- nums) sum += num;
    sum
    // return sum
  }

  // without the "=" at method declaration header,
  // it won't have any return value
  def sumWrong(nums: Int*) {
    var sum = 0; for(num <- nums) sum += num;
    return sum
  }

  def sumVerbose(nums: Int*) : Int = {
    var sum = 0
    for(num <- nums) sum += num
    return sum
  }

  def sumRecursive(nums: Int*) : Int = {
    if(nums.isEmpty) 0
    else nums.head + sumRecursive(nums.tail:_*)
  }
}
