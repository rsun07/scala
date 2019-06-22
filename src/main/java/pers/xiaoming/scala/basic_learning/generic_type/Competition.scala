package pers.xiaoming.scala.basic_learning.generic_type

object Competition {
  // All F1Car's subclass
  def F1CarRace[T <: F1Car](c1:T, c2:T) {
    if (c1.velocity > c2.velocity) {
      printf("%s is faster than %s\n", c1.name, c2.name)
    } else if (c1.velocity == c2.velocity) {
      printf("%s and %s is draw\n", c1.name, c2.name)
    } else {
      printf("%s is faster than %s\n", c2.name, c1.name)
    }
  }

  // Must be super class of FerrariF1
  def ferrariTestFieldRun[R >: F1Car](car:R) {
    car match {
      case _: FerrariF1 =>
        val c = car.asInstanceOf[Car]
        println(c.name + " is testing")
      case _: F1Car =>
        val c = car.asInstanceOf[Car]
        println("Test driver " + c.name + " is testing")
      case _ =>
        println("Don't allowed")
    }
  }
}
