import scala.language.implicitConversions

// Method with implicit parameter
def plus(a: Int)(implicit b: Int): Int = a + b

plus(1)(10)

//plus(1)

implicit  val x: Int = 1
plus(1)

// type เดียวกันอยู่ใน scope เดียวกันไม่ได้
//implicit val z: Int = 11

