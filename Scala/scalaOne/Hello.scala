object Hello{
  def main(args: Array[String]){
    val newHel = new Hel("sarpr", "sam")
    println(newHel.name("kofi"))
  }


class Hel(to: String, from: String) {
  
  def name(userName : String) : String = {
    s"Hey my name is $userName"
  }
}

}
