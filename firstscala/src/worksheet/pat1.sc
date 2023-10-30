case class Person(firstName: String, lastName: String)
case class Dog(name: String)

// Example
def echoWhatyouGaveMe(x: Any): String = x match {
  // constant patterns
  case 0 => "zero"
  case true => "true"
  case "hello" => "you said 'hello"
  case Nil => "an empty List"
  // sequence patterns
  case List(0, _, _) => "a three-element list with 0 as three"
  case List(1, _*) => "a list beginning with 1, having any"
  case Vector(1, _*) => "a vector starting with 1, having"
  // tuple
  case (a, b) => s"got $a and $b"
  case (a, b, c) => s"got $a, $b and $c"
  // constructor patterns
  case Person(first, "Alex") => s"found an Alex $first"
  case Dog("Suka") => s"found a Dog name Suka"
  // typed patterns



  // the default wildcard pattern
  case _=> "Unknown"
}

echoWhatyouGaveMe(0)
echoWhatyouGaveMe(true)
echoWhatyouGaveMe("hello")
echoWhatyouGaveMe(Nil)

echoWhatyouGaveMe(List(0,1,3))
echoWhatyouGaveMe(List(1,2,3,4,5,6))
echoWhatyouGaveMe(Vector(1,2,3,4,5,6))

echoWhatyouGaveMe((1,2))
echoWhatyouGaveMe((1,2,3))

echoWhatyouGaveMe(Person("Melissa", "Alex"))
echoWhatyouGaveMe(Dog("Suka"))
