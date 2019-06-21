package pers.xiaoming.scala.basic_learning.pattern_matching

import org.junit.{Assert, Test}

class FareSystemTest {
  val doubleAssertDelta = 0.0001

  @Test
  def test {
    Assert.assertEquals(0.5, FareSystem.calculate(Student("Mike", "USC")), doubleAssertDelta)
    Assert.assertEquals(0.5, FareSystem.calculate(Senior("Hashi", 70)), doubleAssertDelta)
    Assert.assertEquals(1, FareSystem.calculate(new Person), doubleAssertDelta)
    Assert.assertEquals(1, FareSystem.calculate(Adult("Lowes")), doubleAssertDelta)
  }
}
