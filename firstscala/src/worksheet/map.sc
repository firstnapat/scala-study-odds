val mapExample = Map(
  1->"one",
  2->"two",
  3->"three",
)

for((first, second)<-mapExample) {
  println(s"$first $second")
}