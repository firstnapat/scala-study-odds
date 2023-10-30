// base class
class Employee {
  val salary = 199999
  def work: Unit = {
    eat
    println("bug bug")
  }
  private def eat: Unit = println("yum yum")
  protected def sleep: Unit = {
    println("clock clock")
  }
}

class Programmer extends Employee {
  def awake: Unit = {
    sleep
  }
}

val bob = new Programmer
bob.work
bob.awake

// เรียก sleep ตรงๆไม่ได้
//bob.sleep

ิbob.salary