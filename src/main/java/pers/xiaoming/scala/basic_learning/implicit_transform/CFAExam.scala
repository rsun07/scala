package pers.xiaoming.scala.basic_learning.implicit_transform

object CFAExam {
  private val name = "CFA"

  implicit def adult2Student(person:Adult): Student = new Student(person.name)

  def takeExam(student: Student) {
    student.exam(name)
  }
}
