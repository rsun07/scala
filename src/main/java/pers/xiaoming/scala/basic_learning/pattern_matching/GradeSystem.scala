package pers.xiaoming.scala.basic_learning.pattern_matching

class GradeSystem {
  def scoreToGrade(name:String, score:Int): String = {
    score match {
      case 0 => println(name + " was sick"); "SKIP"
      case _score if _score < 0 || _score > 100 => throw new RuntimeException("Invalid score" + score)
      case _score if _score >= 90 => "A"
      case _score if _score >= 80 => "B"
      case _score if _score >= 70 => "C"
      case _score if _score >= 60 => "D"
      case _ => "F"
    }
  }
}
