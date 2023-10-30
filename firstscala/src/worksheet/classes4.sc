object Person {
  val N_LEGS = 2
  def canEat: Boolean = true
}

Person.N_LEGS
Person.canEat

// SINGLETON INSTANCE
val bob = Person
val alice = Person
// ตัวเดียวกันเสมอเรฟไปที่ตัวเดียวกันต่างจากคลาสในไฟล์ classes1
bob == alice

