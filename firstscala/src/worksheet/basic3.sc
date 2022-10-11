val x:Int = 0
val y: Int = 1
// Expression
val min: Int = if (x<y) x else y

// Statement

val a = if (x<y) println(s"max is $x") else println(s"min is $x")

var a = 5
val b = a = 10 // Statement

println(a)
println(b)

// common mistake
def add(a: Int, b: Int): Unit = {
  val result = a + b
//  but if return result
}

val sum = add(1,2)