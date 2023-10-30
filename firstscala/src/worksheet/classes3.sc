

class Person(val name: String, favoriteBook: String) {
  def likes(book: String): Boolean = book == favoriteBook
  def readWith(person: Person):String = s"$name is reading a book with ${name}"

  def unary_! : String = "bang bang bang"

  def isYellow: Boolean = true

  def apply
}


val bob = new Person(name="Bob", favoriteBook = "How to design programs")
bob.likes(book = "How to design programs")
bob likes "How to design programs" // infix notation
// ต้องมีพารามิเตอร์ 1 ตัวจึงจะเขียนแบบด้านบนเป็น infix ได้
val alice = new Person(name="Alice", favoriteBook = "")
bob readWith alice // infix notation

// prefix notation
val x = -1
val y = 1.unary_-
// unary_{prefix} - + ~ !
!bob

bob isYellow

// apply
bob.apply()
bob()