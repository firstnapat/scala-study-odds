// modeling immutable data
case class Book(isbn: String)

val frankenstein = Book("978-0486282114")

case class Message(sender: String, recipient:String, body:String)

val message1 = Message("santi@odds.team", "pin@odds.team", "bug bug")
message1.sender
//message1.sender = "test@test.com"
val message2 = Message("santi@odds.team", "pin@odds.team", "bug bug")
val message3 = Message("santi@odds.team", "pin@odds.team", "bug bug")

message2 == message3

val message4 = Message("santi@odds.team", "pin@odds.team", "bug bug")
val message5 = message4.copy(recipient = "tong@odds.team")
message4 == message5

