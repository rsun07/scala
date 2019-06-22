package pers.xiaoming.scala.basic_learning.implicit_transform

import org.junit.Test

class SignatureBoardTest {
  val board = new SignatureBoard

  @Test
  def testWithoutImplicitImported {
    // import SignatureBoard.pen

    board.sign("My name")(new Pen("My Own Pen"))
  }

  @Test
  def testWithImplicitImported {
    import SignatureBoard.pen

    board.sign("My name")
  }
}
