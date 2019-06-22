package pers.xiaoming.scala.basic_learning.generic_type

class Car(val name:String, val velocity:Int)

class F1Car(name:String, velocity:Int) extends Car(name:String, velocity:Int)
class FerrariF1(name:String, velocity:Int) extends F1Car(name:String, velocity:Int)
class RedBullF1(name:String, velocity:Int) extends F1Car(name:String, velocity:Int)

class Jeep(name:String, velocity:Int) extends Car(name:String, velocity:Int)

