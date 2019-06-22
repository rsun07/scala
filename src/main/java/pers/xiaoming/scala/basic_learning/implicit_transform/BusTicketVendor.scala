package pers.xiaoming.scala.basic_learning.implicit_transform

class BusTicketVendor {
  def DiscountedTicket(person:DiscountEligiblePerson): Double = {
    person.discount
  }
}

object BusTicketVendor {
  implicit def object2DiscountEligiblePerson(obj:Object): DiscountEligiblePerson = {
    obj match {
      case _obj if obj.getClass == classOf[Student] => val p = _obj.asInstanceOf[Student]; new DiscountEligiblePerson(p.name, 0.6)
      case _obj if obj.getClass == classOf[Senior] => val p = _obj.asInstanceOf[Senior]; new DiscountEligiblePerson(p.name, 0.5)
      case _obj if obj.getClass == classOf[Disabled] => val p = _obj.asInstanceOf[Disabled]; new DiscountEligiblePerson(p.name, 0.4)
    }
  }
}
