package pers.xiaoming.scala.basic_learning.implicit_transform

import org.junit.Test

class CFAExamTest {
  val adult = new Adult("John")

  @Test
  def testWithoutImplicitImported {
    // CFAExam.takeExam(adult)
  }

  @Test
  def testWithImplicitImported {
    import CFAExam.adult2Student
    CFAExam.takeExam(adult)
  }
}
