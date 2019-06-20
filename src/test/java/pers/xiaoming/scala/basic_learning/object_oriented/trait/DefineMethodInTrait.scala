package pers.xiaoming.scala.basic_learning.object_oriented.`trait`

import org.junit.Test
import pers.xiaoming.scala.basic_learning.object_oriented.`trait`.define_method_in_trait.Worker

class DefineMethodInTrait {
  @Test
  def test: Unit = {
    val worker = new Worker
    worker.work("Coding")
  }
}
