package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.define_field_and_method_in_trait

import org.junit.Test

class DefineMethodInTrait {
  @Test
  def test: Unit = {
    val worker = new Engineer("Mike")
    worker.work("Coding")
  }
}
