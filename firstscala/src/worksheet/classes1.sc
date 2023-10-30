
class Too

class TooMuch {
  val x = 10
  val y = 20

  def addX(a:Int): Int = a + x
}

val tooMuch = new TooMuch

tooMuch.x

tooMuch.addX(1)
// เติม val หน้าพารามจะประกาศตัวแปรนั้นเป็น public
class VeryMuch(val name: String) {
  println(s"Hello $name")

  def sayHi(): Unit = {
    println(s"Hi $name")
  }
}
// เป็นคนละตัวกัน อ้างอิงกันคนละแฮชโค้ด
val veryMuch = new VeryMuch(name = "Too")
val veryMuch2 = new VeryMuch(name = "Too")

veryMuch.sayHi()

veryMuch.name

veryMuch == veryMuch2

class SoMuch(_name: String) {
  val name = _name
}

val soMuch = new SoMuch(_name = "Too")
soMuch.name