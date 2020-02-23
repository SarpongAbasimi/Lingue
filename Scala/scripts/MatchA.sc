val seq = Seq("2", "name", "vda")

for(i <- seq){
  i match {
    case two @ "2" => 
    println(s"Yes $two was matched")
    case nome @ "name" => printf("name: %s\n",nome)
    case _ => println("That that that")
  }
}