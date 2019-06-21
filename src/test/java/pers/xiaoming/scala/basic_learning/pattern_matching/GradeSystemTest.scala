package pers.xiaoming.scala.basic_learning.pattern_matching

import org.junit.{Assert, Test}

class GradeSystemTest {
  @Test
  def happyPath: Unit = {
    Assert.assertEquals("A", GradeSystem.scoreToGrade("Omini", 93))
    Assert.assertEquals("B", GradeSystem.scoreToGrade("Yimi", 89))
    Assert.assertEquals("C", GradeSystem.scoreToGrade("Lain", 79))
    Assert.assertEquals("D", GradeSystem.scoreToGrade("John", 69))
    Assert.assertEquals("F", GradeSystem.scoreToGrade("Yomo", 59))
    Assert.assertEquals("SKIP", GradeSystem.scoreToGrade("Mike", 0))
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
