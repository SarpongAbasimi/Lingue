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