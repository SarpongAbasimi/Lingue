def aPartialFuction: PartialFunction[String, Unit] = {
  case "hey" => println("Yas")
  case "nah" => println("Nah")
  case _ => println("Ping ping")
}

aPartialFuction("hey")
aPartialFuction("nah")
aPartialFuction("Nah")
// println(a)