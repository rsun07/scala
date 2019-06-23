package pers.xiaoming.scala.basic_learning.akka

import akka.actor.Actor

class CounterActor(name:String) extends Actor {
  override def receive: Receive = {
    case "+" => CounterActor.count += 1; println(name + " : " + CounterActor.count)
    case _ => println("Not know")
  }
}

object CounterActor {
  var count = 0
}
