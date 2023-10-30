class Person(name: String, val age: Int = 0) {
  // method
  def sayHi(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading or polymorphism
  // ชื่อเหมือนกันได้แต่ส่งไทม์คนละตัว
  def sayHi(): Unit = println(s"Hi, I am $name")

    // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("Little")
}


val bob = new Person(name = "Bob", age = 18)
bob.sayHi(name="Alice")
bob.sayHi()

val alice = new Person(name = "Alice")

val little = new Person

little.sayHi()