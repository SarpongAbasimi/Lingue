class Hello(to: String, from: String) {
  
  def name(userName : String) : String = {
    s"Hey my name is $userName"
  }
}

val firstHello = new Hello("chris", "Sarpong")

println(firstHello.to)