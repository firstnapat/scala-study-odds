class MyClass[A](param1: String, param2: A) {
  def getParam2Type: String = param2 match {
    case _: String => "String"
    case _: Int => "Int"
    case _: Double => "Double"
    case _: BigDecimal => "BigDecimal"
    case _: Boolean => "Boolean"

    case _=>"Unknown type"

  }
}

val c1 = new MyClass[String](param1="c1", param2 = "abcd")
c1.getParam2Type
val c2 = new MyClass(param1="c2", param2 = 12)
c2.getParam2Type
val c3 = new MyClass(param1="c3", param2 = true)
c3.getParam2Type
val c4 = new MyClass(param1="c4", param2 = 0.5)
c4.getParam2Type
val c5 = new MyClass(param1="c5", param2 = 'a')
c5.getParam2Type
val c6 = new MyClass(param1="c6", List(12, 13))
c6.getParam2Type
val c7 = new MyClass(param1="c7", List("123", "1234"))
c7.getParam2Type

