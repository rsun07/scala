package pers.xiaoming.scala.basic_learning.akka

import akka.pattern.ask
import akka.actor.{ActorSystem, Props}
import akka.util.Timeout

import scala.concurrent.duration._
import org.junit.{AfterClass, Test}

import scala.concurrent.Await


class ClientActorTest {
  @Test
  def fireAndForgetTest: Unit = {
    ClientActorTest.clientActor ! "request"
    println("TEST: Client request sent out")

    Thread.sleep(2000)
  }

  @Test
  def asyncTest: Unit = {
    implicit val timeout = Timeout(5 seconds)
    val future = ClientActorTest.clientActor ? "request"
    println("TEST: Client request sent out")

    // here is a blocking call
    val result = Await.result(future, timeout.duration)
    println("TEST: Result is : " + result)
  }

}

object ClientActorTest {
  private val actorSystem = ActorSystem("client_actor_system")
  private val clientActor = actorSystem.actorOf(Props[ClientActor])

  @AfterClass
  def close: Unit = {
    actorSystem.terminate()
  }
}
