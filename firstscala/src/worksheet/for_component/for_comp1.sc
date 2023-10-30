case class User(name: String, age: Int)

val userBase = List(User("Travis", 28),
  User("Kelly", 33),
  User("jenifer", 44),
  User("Dennis", 23))

val twentySomethings = for (
  user <- userBase if (user.age>=20 && user.age < 30)
  ) yield user.name