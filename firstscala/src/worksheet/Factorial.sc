def Factorial(n: Int): Unit = {
  var result = 1
  var n = 0
  while (n > 0) {
    result *= n
    n = n - 1
    println(result)
  }

}
Factorial(6)
