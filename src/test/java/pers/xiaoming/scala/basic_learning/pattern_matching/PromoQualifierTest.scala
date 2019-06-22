package pers.xiaoming.scala.basic_learning.pattern_matching

import org.junit.{Assert, Test}

class PromoQualifierTest {
  val doubleAssertDelta = 0.0001

  @Test
  def test {
    Assert.assertEquals(0.2, PromotionQualifier.checkCouponRatio("CA"), doubleAssertDelta)
    Assert.assertEquals(0.18, PromotionQualifier.checkCouponRatio("NY"), doubleAssertDelta)
    Assert.assertEquals(0.15, PromotionQualifier.checkCouponRatio("VA"), doubleAssertDelta)
    Assert.assertEquals(1, PromotionQualifier.checkCouponRatio("OR"), doubleAssertDelta)
  }
}
