class Hello(yourname: String){
  def sayHello(): Unit = {
    println(s"Hello $yourname")
  }
}

object main{
  def main(args: Array[String]) = {
    val newHelloInstance = new Hello("chris")
    newHelloInstance.sayHello
  }
}