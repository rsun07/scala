package pers.xiaoming.scala.basic_learning.pattern_matching

object PromotionQualifier {
  private val stateToCouponRatio = Map("CA" -> 0.2, "NY" -> 0.18, "VA" -> 0.15)

  def checkCouponRatio(state:String): Double = {
    val ratio = stateToCouponRatio.get(state)

    ratio match {
      case Some(_ratio) => printf("%s state resident, %s discount!\n", state, _ratio); _ratio
      case None => printf("%s state residents are not eligible!\n", state); 1
    }
  }
}
