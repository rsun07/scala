package pers.xiaoming.scala.basic_learning.akka

import akka.actor.{Actor, ActorSystem, Props}

class HelloActor extends Actor {
  override def receive: Receive = {
    case "Hello" => println("Hello Actor")
    case "World" => println("Hello World")
    case 0 => println("int 0")
    case _ => println("Unknown input")
  }
}

object HelloActor extends App {
  val actorSystem = ActorSystem.create("helloActorSystem")
  val helloActor = actorSystem.actorOf(Props(new HelloActor), "helloActor")
  helloActor ! "Hello"
  helloActor ! "World"
  helloActor ! 0
  helloActor ! Array(0)
}
