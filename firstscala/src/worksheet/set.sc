import scala.collection._

// val s1 = Set(1,2,3,1,2,3)
// immutable
// un order
//val s2 = Set(1,2,3,4,5,1,2,3)
// val cannot assign but it's mutable ทำให้มัน re-assign ได้
val s1 = mutable.Set(1,2,3)
var s2 = immutable.Set(1,2,3)

s1 += 4
s2 = s2 + 4

println(s2)
// list is immutable by default
val xs = List(1,2,3)

// xs(1) = 99
// xs = 0 :: xs
var listA = List(1,2,3)
listA = 0 :: listA
listA

var s3 = s1
s3 += 5
// ลองดูค่า s1 จะเห็นว่าเกิดเป็น pointer s1 เลยมีเลข 5 โผล่มา
s1

val x = List(1,2,3)

val y = x