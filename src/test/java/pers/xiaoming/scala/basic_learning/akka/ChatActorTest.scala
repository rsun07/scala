package pers.xiaoming.scala.basic_learning.akka

import akka.actor.{ActorSystem, Props}
import org.junit.Test

class ChatActorTest {
  @Test
  def test: Unit = {
    val chatActorSystem = ActorSystem("chatSystem")
    val chat1ActorRef = chatActorSystem.actorOf(Props[ChatActor], "Mike")
    val chat2ActorRef = chatActorSystem.actorOf(Props[ChatActor], "Marry")

    chat1ActorRef ! chat2ActorRef
    chat1ActorRef ! chat2ActorRef
    chat2ActorRef ! chat1ActorRef

    Thread.sleep(5000)
    chatActorSystem.terminate()
  }
}
