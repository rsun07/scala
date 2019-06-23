package pers.xiaoming.scala.basic_learning.akka

import akka.actor.{ActorRef, ActorSystem, Props}
import org.junit.{Assert, Test}

import scala.collection.mutable

class CounterActorTest {
  @Test
  def singleActorTest: Unit ={
    val totalRound = 10
    val counterActorSystem = ActorSystem("counter_system")
    val counterActor = counterActorSystem.actorOf(Props(new CounterActor("CounterActor")), "CounterActor")

    var i = 0
    while (i < totalRound) {
      counterActor ! "+"
      i += 1
    }
    counterActorSystem.terminate()
    Thread.sleep(10)

    Assert.assertSame(totalRound, CounterActor.count)
  }

  @Test
  def multiActorTest: Unit ={
    val totalRound = 10
    val totalActor = 3

    val counterActorSystem = ActorSystem("counter_system")
    val counterActors:mutable.HashSet[ActorRef] = mutable.HashSet()

    for (i <- 1 to totalActor) {
      val counterActorRef = counterActorSystem.actorOf(Props(new CounterActor("CounterActor" + i)), "CounterActor" + i)
      counterActors.add(counterActorRef)
    }

    var i = 0
    while (i < totalRound) {
      for (counterActorRef:ActorRef <- counterActors) {
        counterActorRef ! "+"
      }
      i += 1
    }

    counterActorSystem.terminate()
    Thread.sleep(10)

    Assert.assertSame(totalRound * totalActor, CounterActor.count)
  }
}
