import scala.util.Random

object CustomerID {
  def apply(name: String) = s"$name--${Random.nextLong}"

  def unapply(customerID: String): Option[String] = {
    val stringArray: Array[String] = customerID.split("--")
    if (stringArray.tail.nonEmpty) Some(stringArray.head) else None
  }
}

val customerID = CustomerID("Sukyong")
customerID match {
  case CustomerID(name) => println(name)
  case _ => println("Could not extract a Customer ID")
}

val customer2ID = CustomerID.apply("Nico")
val CustomerID(name) = customer2ID
val name = CustomerID.unapply(customer2ID).get

case class Book(isbn: String)

val frankenstein = Book("978-0486282114")

val isbn = Book.unapply(frankenstein)

case class Foo(foo:String, bar:Int)
val fool = Foo("test", 123)

val x = Foo.unapply(fool)

val (str, in) = Foo.unapply(fool).get


