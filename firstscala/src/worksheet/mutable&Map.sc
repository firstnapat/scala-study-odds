import scala.collection._

val m1 = mutable.Map('a'->1, 'b'->2)
var m2 = immutable.Map('c'->1, 'd'->4)

m1 ++= m2

m1('a') = 4
m1
// -> is method
m2 += 'e' -> 5
m2

"hi".->(10)
"hi"->10

1 -> "One"
1.->("One")