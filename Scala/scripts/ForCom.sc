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