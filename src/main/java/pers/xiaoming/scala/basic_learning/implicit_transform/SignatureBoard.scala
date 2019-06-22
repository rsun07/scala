package pers.xiaoming.scala.basic_learning.implicit_transform

class SignatureBoard {
  def sign(name:String)(implicit pen:Pen) = pen.write(name)
}

object SignatureBoard {
  implicit val pen = new Pen("Signature Board Pen")
}

class Pen(name:String) {
  def write(content:String) = printf("Sign content <%s> with pen <%s>\n\n", content, name)
}

