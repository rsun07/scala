package pers.xiaoming.scala.basic_learning.akka

import akka.actor.{Actor, ActorRef}

class ChatActor extends Actor {
  override def receive: Receive = {
    case chater:ActorRef =>
      printf("%s start chat with %s\n", self.path.name, chater.path.name)
      chater ! 1
    case _message:Int =>
      printf("%s receive message from %s, message is %s\n", self.path.name, sender().path.name, _message)
      if (_message < 5) {
        Thread.sleep(1000)
        sender() ! _message + 1
      }
  }
}
