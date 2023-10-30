// Companion object

class Person {
  var name: String = _
  private val secret = 2

  def printObj {println(s"This is ${Person.obj}")}
}
object Person {
  private val obj = "this person object"
  // factory method
  def apply(name: String): Person = {
    val p = new Person
    p.name = name
    p
  }
  def double(person: Person): Int = person.secret
}

val too = Person("Too")
val pom = Person("Pom")

too.name
// เรียก private ด้านนอกไม่ได้
//  คนละ Instance กัน
too == pom

too.printObj

