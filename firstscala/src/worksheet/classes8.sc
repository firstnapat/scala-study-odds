abstract class Employee {
  val name: String
  val bonus: Int
  def work: Unit
}

class Programmer (override val name: String) extends Employee {
  override val bonus: Int = 500
  def work: Unit = println("bug bug")
}

trait SoftwareEngineer {
  def work(employee: Employee): Unit
  val salary: Int = 500000
}

trait Teacher

class Developer(override val name:String) extends Employee with SoftwareEngineer {
  override val bonus: Int = 500
  def work: Unit = println("bug bug")

  override def work(employee: Employee): Unit = println(s"I'm bug ${employee.name}")
}



val bob = new Developer(name="Bob")
val alice = new Developer(name="Alice")

bob.work
bob.work("Alice")