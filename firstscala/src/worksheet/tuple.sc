// Tuple
def sumAndDiff(a: Int, b:Int): (Int, Int) = {
  val sum = a + b
  val diff = a - b
  (sum, diff)
}

val result = sumAndDiff(1, 2)
// เอาสมาชิกตัวแรกที่ return
result._1
result._2

val tub5 = (0, '1', '2', '3', "four")
tub5._5
tub5._2

val(xyz,b,c,d,e) = tub5
xyz
b
e

val (_,x,_,_,_) = tub5
x