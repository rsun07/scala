package pers.xiaoming.scala.basic_learning.generic_type

class Car {
  var name:String = _
  var velocity:Int = _
  def this(n:String, v:Int) {
    this()
    name = n
    velocity = v
  }
}

class F1Car extends Car
class FerrariF1 extends F1Car
class RedBullF1 extends F1Car

class Jeep extends Car

