package pers.xiaoming.scala.basic_learning.functional_programming

import org.junit.Test

class FuncProgrammingIntro {

  @Test
  def funcToVariable {
    val logger = (msg:String) => println("Log: " + msg)

    logger.apply("message")

    log(logger, "message in private demo func")
  }

  private def log(func:(String) => Unit, msg:String) {
    func.apply(msg)
  }

  @Test
  def funcAsReturnVal {
    val loggerInfo = getLoggerFunc("INFO")

    loggerInfo.apply("log info")

    val loggerError = getLoggerFunc("Error")

    // Scala Closures
    loggerError.apply("log error")
    loggerInfo("log info again")
    loggerError("log error again")
  }

  private def getLoggerFunc(level:String) = (msg:String) => println(level + " : " + msg)
}
