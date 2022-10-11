//var b: Int = 10
//
//b=10
//
//print(b)
//
//val c: Int = 20
//print(c)
//
//{
//  val c: Int = 11
//  println(c)
//}
//println(c)
//
//val x = 10
//def add(a: Int, b:Int): Int = a + b
//
//val a = 10
//var b = 20
//
//add(a, b)
//
//def minus(a: Int, b:Int) = a - b
//
//minus(a, b)
//
def talk(lang: String): Unit = {
  println(s"Talk $lang")
}
//
//talk( lang="Hello")

//val a = 10
//val b = 20
//val c = if (a > b) a else b

val divided = try {
  10/0
} catch {
  case _: ArithmeticException => throw new RuntimeException("Can not divided by zero")
} finally {
//  side-effecting
  println("this hello")
  10
}