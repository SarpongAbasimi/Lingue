val seq = Seq("2", "name", "vda")

for(i <- seq){
  i match {
    case two @ "2" => 
    println(s"Yes $two was matched")
    case nome @ "name" => printf("name: %s\n",nome)
    case _ => println("That that that")
  }
}

//Curring Functions

def cat1(s1 : String, s2: String): Unit = {
  println(s"$s1 $s2")
}

cat1(s1="Hello", s2="World")

println("-------------------")

def cat2(s1: String)(s2: String) {
  println(s"S1: $s1  s2: $s2")
}

val n = cat2("Hello") _

println(n("world"))