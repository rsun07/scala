package pers.xiaoming.scala.basic_learning.pattern_matching

import org.junit.Test

class GradeSystemTest {

  private val gradeSystem = new GradeSystem

  @Test
  def happyPath: Unit = {
    println(gradeSystem.scoreToGrade("Yimi", 89))
    println(gradeSystem.scoreToGrade("Lain", 79))
    println(gradeSystem.scoreToGrade("Omini", 93))
    println(gradeSystem.scoreToGrade("John", 69))
    println(gradeSystem.scoreToGrade("Yomo", 59))
    println(gradeSystem.scoreToGrade("Mike", 0))
  }

  @Test(expected = classOf[RuntimeException])
  def biggerThan100: Unit = {
    gradeSystem.scoreToGrade("Julia", 130)
  }

  @Test(expected = classOf[RuntimeException])
  def lowerThan0: Unit = {
    gradeSystem.scoreToGrade("Julia", -10)
  }
}
