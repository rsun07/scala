package pers.xiaoming.scala.basic_learning.pattern_matching

import java.io.IOException

import org.junit.{Assert, Test}

class ExceptionMapperTest {
  @Test
  def test: Unit = {
    Assert.assertEquals("Runtime Exception", MyExceptionMapper.mapper(new RuntimeException))
    Assert.assertEquals("IOException", MyExceptionMapper.mapper(new IOException))
    Assert.assertEquals("Unknown Exception", MyExceptionMapper.mapper(new Exception))
  }
}
