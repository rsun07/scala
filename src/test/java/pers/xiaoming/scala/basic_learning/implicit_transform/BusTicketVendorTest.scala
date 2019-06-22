package pers.xiaoming.scala.basic_learning.implicit_transform

import org.junit.{Assert, Test}

// import implicit transform
import BusTicketVendor.object2DiscountEligiblePerson

class BusTicketVendorTest {
  val doubleAssertDelta = 0.0001
  val vendor = new BusTicketVendor

  @Test
  def happyPathTest {
    Assert.assertEquals(0.6, vendor.DiscountedTicket(new Student("Ryan")), doubleAssertDelta)
    Assert.assertEquals(0.5, vendor.DiscountedTicket(new Senior("Henry")), doubleAssertDelta)
    Assert.assertEquals(0.4, vendor.DiscountedTicket(new Disabled("Mike")), doubleAssertDelta)
  }

  @Test(expected = classOf[scala.MatchError])
  def failedPathTest {
    vendor.DiscountedTicket(new Adult("Mike"))
  }
}
