package pers.xiaoming.scala.basic_learning.akka

import akka.actor.{Actor, ActorKilledException, ActorSystem, Kill, Props}

class HelloActor extends Actor {
  override def preStart(): Unit = println("\nHello Actor pre start\n")

  override def postStop(): Unit = println("\nHello Actor post stop\n")

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

  try {
    helloActor ! Kill
  } catch {
    case e:ActorKilledException => println("Exception catch"); println(e.message)
    case _ => println("Unknown Exception catch")
  }

  println("hello actor killed")
  Thread.sleep(2000)

  actorSystem.terminate()
  println("actor system terminated")
}
