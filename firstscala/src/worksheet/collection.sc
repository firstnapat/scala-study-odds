// Collection eg. Tuple
// ปกติ collection จะเก็บได้ 1 type
val arr1:Array[Int] = Array(1, 2)
val list1: List[String] = List("Jane","Proof")
// ละ type ได้
val arr2 = Array(1, 2)

def lengthOfList(xs: List[String]): Int = xs.size

def plus2(xs: List[Int]): List[Int] = {
  for (x <- xs) yield x + 2
}
plus2(List(1,2))
val listA = List(1,2,3)
val listB = 4 :: 5 :: Nil

val listC = Nil.::(5)
val listD = listA.::(0)