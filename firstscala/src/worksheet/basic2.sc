//var a = 0
//
//while (a < 5) {
//  println(s"a is $a")
//  a += 1
//}
//
//a = 0
//
//do {
//  println(s"a is $a")
//  a += 1
//} while (a < 5)
//
//a=5
//
//while (a > 0) {
//  println(s"a is $a")
//  a -= 1
//}

def Factorial(n: Int): Unit = {
  var result = 1
  var n = 0
  while (n > 0) {
    result *= n
    n = n - 1
  }
  println(result)
}
Factorial(6)
