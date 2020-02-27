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

// Construction of List O(N)

val listOne: List[String] = List("name", "age")
println(listOne)

val list2 = "name" :: "age" :: Nil

// O(1)

val vector : Vector[String] = Vector("name", "age")

val b = vector :+ "another thing" //Append

val c = "nect" +: b //prepend

// Uisng Maps In Scala

val countiesAndTheirCapitals = Map("China" -> " Bejin", "Italy" -> "Roma")

countiesAndTheirCapitals map {
  eachKey => (eachKey._1, eachKey._2.length)
}

//
for((key, value) <- countiesAndTheirCapitals){
  println(s"Country: $key, lenght: ${value.length}")
}