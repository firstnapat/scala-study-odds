
val add1 = (i: Int) => i + 1

val double = (i: Int) => i * 2

add1(1)

//val addXY = (x: Int, y: Int) => x+y
//addXY(1, 2)

val addXY = (x: Int) => (y: Int) => x+y
val resultX = addXY(1)
resultX(2)
def addMultipleParams(a: Int, b: Int): Int = a + b

addMultipleParams(1, 2)

def add(a: Int)(b: Int): Int = a + b

add(3)(4)

val addFn = add _

val add2 = addFn(2)

add2(1)

val addThenDouble = add1 andThen double
addThenDouble(1)

val doubleThenAdd = add1 compose double

doubleThenAdd(1)