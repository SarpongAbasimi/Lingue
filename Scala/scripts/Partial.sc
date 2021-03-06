import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

def aPartialFuction: PartialFunction[String, Unit] = {
  case "hey" => println("Yas")
  case "nah" => println("Nah")
  case _ => println("Ping ping")
}

// aPartialFuction("hey")
// aPartialFuction("nah")
// aPartialFuction("Nah")
// println(a)

//MathError For Partial Function.

def aSecondPartialFunction: PartialFunction[String,Int] = {
  case "Hello" => {
    println("You said Hello")
    1
  }
}

try{
  aSecondPartialFunction("haha")
}catch {
  case errors: MatchError=> {
    println(s"The was a masive error called $errors")
  }
}


// Copy Method of Case Classes

case class Point(x:Double = 0.0, y:Int = 1)

val createInstanceOfCaseClass = new Point

val usingCopyMethod = createInstanceOfCaseClass.copy(x = 10.0, y = 20)

println(usingCopyMethod)
println(usingCopyMethod.y)
printf("%s", usingCopyMethod.x)

// Using abstract classes

abstract class Person {
  def name(aname:String): String;
}

class Chris extends Person {
  override def name(name: String) = {
    name
  }
}


//Futures in Scala
def sleepFor(amountOfTime: Int) = {
  Thread.sleep(amountOfTime)
}

val future = Future{
  for(i <- 1 until  3){
    sleepFor(i)
    println(s"Sleeping for $i")
  }
}

future.onComplete {
  case answer: scala.util.Try[Unit] => answer
}

//Basic For Loop
val basicForCompresion: List[String] = List("name", "age", "country")

for(i <- basicForCompresion){
  println(i)
}

// Guard Filtering Values

for (i <- basicForCompresion if i.startsWith("na")){
  println(i)
}

val numbers: List[Int] = List(2, 4, 5, 7)

//Yield
val yieldResults = for (i <- numbers) yield i * 4

println(yieldResults)

// Using Traits

trait Logging {
  def info(message: String): Unit
  def error(message: String): Unit
  def warning(message: String): Unit
}

trait StdOut extends Logging {
  def info(message: String): Unit = println(s"info $message")

  def warning(message: String): Unit = println(s"Warning message: $message")

  def error(message: String): Unit = println(s"Error message: $message")
}

class ServiceImportante(name: String) {
  def work(i: Int): Int = {
    println(s"ServiceImportante: Doing important work! $i")
    i + 1
  }
}

val service2 = new ServiceImportante("dos") with StdOut {
  override def work(i: Int): Int = {
    warning(s"This is a waring from dos and Sarp")
    info(s"Starting work: i = $i")
    val result = super.work(i)
    info(s"Ending work: i = $i, result = $result")
    result
  }
}

(1 until 4).foreach(i => {
  println(s"The result is ${service2.work(i)}")
})

// Pattern matching Case Class

case class Address(street: String, city: String, 
                  postCode: String)
case class Persons(name: String, address: Address)

val sam = Persons("Sam", Address("df", "Ldn", "B21"))
val am = Persons("am", Address("dfs", "Ldns", "B22"))

val personSeq: Seq[Persons] = Seq(sam, am)

for( seq <- personSeq){
  seq match {
    case Persons("Sam", Address("df", "Ldn", _)) =>
    println(s"yasss, $seq")
    case _ => println(s"hahahahaha $seq")
  }
}

//Value classes (They are used for optimization to avoid creating new class instance)
//Reson for Error -> https://github.com/scalacenter/scastie/issues/80

case class PersonName(name: String) extends AnyVal
case class PersonAge(age: Int) extends AnyVal

class Persona(name: PersonName, age: PersonAge) {
  override def toString() = {
    s"Name: $name, Age: $age"
  }
}

// Implicit class
// https://stackoverflow.com/questions/40878893/implicit-classes-in-scala

import scala.language.postfixOps
implicit class Name(name: String){
  def callName = {
    println(name)
  }
}

"I get it now" callName
