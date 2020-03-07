// import scala.io.StdIn.{readLine}
import scala.io.StdIn.{readLine, readInt}

val name : Seq[String] = Seq("nana", "yaw", "ama")

for {
  names <- name
} println(names)

val a = for {
  anothernames <- name
} yield anothernames.toUpperCase

println(a)

//Same as saying

val c = name.map(_.toUpperCase)
println(c)

println("------")

val nm = for {
  names <- name // nana, yaw, ama
  idName <- names
} yield idName.toUpper

println(nm)

println("----------------")

val something = 8

val result: Either[String, Int] = {
  try {
    Right(something.toInt)
  } catch {
    case error: Exception => {
      Left(s"Nooooo $error")
    }
  }
}

//Try

import scala.util.{ Try, Success, Failure }

def gereaterThanOne(aNumber: Int): Try[Int] = Try{
  assert(aNumber > 1,"jnj")
  aNumber
}

// Auxiliary Cons

class Name {
  private var name: String = ""
  private var secondName: String = ""
  def show: Unit = {
    println(s"This the the fist $name")
    println(s"This is my second name $secondName")
  }

  def this(name: String, secondName: String) = {
    this()
    this.name = name
    this.secondName = secondName
  }
}

val ams = new Name("ere", "erewe")
ams.show


// Covariance in scala

trait Human {
  def name(aName:String) = aName
  def age(aNumber: Int) = aNumber
}

case class Person(name:String, age: String) extends Human
case class Yaw(name: String, age: String) extends Human



def someFunction[A <: Human](aperSson: A): String = "hey" 

val p = Person("ns", "44")
val c = Yaw("ns", "90")
someFunction(c)