package pers.xiaoming.scala.basic_learning.akka

import akka.actor.Actor

class ClientActor extends Actor {
  override def receive: Receive = {
    case "request" =>
      println("CLIENT: Received request, processing")
      Thread.sleep(2000)
      println("CLIENT: Get result, returning")
      sender ! "reply"
    case _ => sender ! "unknown"
  }
}
