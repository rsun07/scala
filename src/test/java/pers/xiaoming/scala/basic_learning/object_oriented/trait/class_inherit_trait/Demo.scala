package pers.xiaoming.scala.basic_learning.object_oriented.`trait`.class_inherit_trait

import org.junit.Test

class Demo {
  @Test
  def demo {
    val myClass = new ExtendedClass
    myClass.name
    myClass.traitValue
    myClass.printBase
    myClass.printTrait
    myClass.printExtendedClass
  }
}
