def divideByY(x:Int, y:Int):Either[String, Int] = {
  if (y == 0) Left("Can't divide by 0")
  else Right(x / y)
}

println(divideByY(1, 0))
println(divideByY(1, 1))

divideByY(1, 0) match {
  case Left(s) => println("Answer:" + s)
  case Right(i) => println("Answer:" + i)
}