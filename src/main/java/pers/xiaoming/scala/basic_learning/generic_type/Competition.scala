package pers.xiaoming.scala.basic_learning.generic_type

object Competition {
  // All F1Car's subclass
  def F1CarRace[T <: F1Car](c1:F1Car, c2:F1Car) {
    if (c1.velocity > c2.velocity) {
      printf("%s is faster than %s\n", c1.name, c2.name)
    } else if (c1.velocity == c2.velocity) {
      printf("%s and %s is draw\n", c1.name, c2.name)
    } else {
      printf("%s is faster than %s\n", c2.name, c1.name)
    }
  }

  // Must be super class of FerrariF1
  // Exclude RedBullF1 car
  def ferrariAndF1OnlyRace[R >: FerrariF1](c1:FerrariF1, c2:FerrariF1) {
    if (c1.velocity > c2.velocity) {
      printf("%s is faster than %s\n", c1.name, c2.name)
    } else if (c1.velocity == c2.velocity) {
      printf("%s and %s is draw\n", c1.name, c2.name)
    } else {
      printf("%s is faster than %s\n", c2.name, c1.name)
    }
  }


}
