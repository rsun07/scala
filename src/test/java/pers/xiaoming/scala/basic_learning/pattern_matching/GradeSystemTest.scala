package pers.xiaoming.scala.basic_learning.pattern_matching

import org.junit.Test

class GradeSystemTest {
  @Test
  def happyPath: Unit = {
    println(GradeSystem.scoreToGrade("Yimi", 89))
    println(GradeSystem.scoreToGrade("Lain", 79))
    println(GradeSystem.scoreToGrade("Omini", 93))
    println(GradeSystem.scoreToGrade("John", 69))
    println(GradeSystem.scoreToGrade("Yomo", 59))
    println(GradeSystem.scoreToGrade("Mike", 0))
  }

  @Test(expected = classOf[RuntimeException])
  def biggerThan100: Unit = {
    GradeSystem.scoreToGrade("Julia", 130)
  }

  @Test(expected = classOf[RuntimeException])
  def lowerThan0: Unit = {
    GradeSystem.scoreToGrade("Julia", -10)
  }
}
