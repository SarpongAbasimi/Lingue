class Person{
  var name: String = "temp"
  var gender: String = "temp"
  var age: Int = 0

  def walking = println(s"$name is walking")

  def talking = println(s"$name is talking")

}
// Creating an object of the Person class
val firstPerson = new Person 

firstPerson.name = "Sarah"
firstPerson.gender = "female"
firstPerson.age = 25

firstPerson.walking
firstPerson.talking