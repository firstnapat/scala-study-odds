// base class, constructors
sealed class Employee(val salary: Int) {
  def work: Unit = println("bug bug")
  val bonus = 500
}

class Programmer(salary: Int, override val bonus: Int) extends Employee(salary) {
 // override val bonus = 600

  override def work: Unit = println("bug bug")
}

class Doctor(salary: Int) extends Employee(salary)

val bob = new Programmer(salary = 100000, bonus = 800)
bob.work
bob.bonus

val alice = new Doctor(salary = 300000)

// type substitute
val someEmployee: Employee = new Doctor(salary = 5000)

// prevent override