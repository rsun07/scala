package pers.xiaoming.scala.basic_learning.pattern_matching

import java.io.IOException

import org.junit.Test

class ExceptionMapperTest {
  @Test
  def test: Unit = {
    println(MyExceptionMapper.mapper(new RuntimeException))
    println(MyExceptionMapper.mapper(new IOException))
    println(MyExceptionMapper.mapper(new Exception))
  }
}
