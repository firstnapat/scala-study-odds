def toInt(in: String): Option[Int] = {
  try {
    Some(Integer.parseInt(in.trim))
  }catch {
    case e: NumberFormatException => None
  }
}

toInt("234") match {
  case Some(i) => println(i)
  case None => println("That didn't work.")
}

def toIntImp(in: String): Integer = {
  try {
    Integer.parseInt(in.trim)
  } catch {
    case e: NumberFormatException => null
  }
}

val i = toIntImp("too")
  if (null == i) {
    println("That didn't work.")
  } else {
    println("i")
  }

val bag = List("1", "2", "foo","3", "bar")


bag.map(toIntImp)

bag.map(toInt)

bag.flatMap(toInt)

bag.flatMap(toInt).sum