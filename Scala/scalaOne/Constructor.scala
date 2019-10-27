object The {
  def main(args: Array[String]) = {
    val aNewConstructor = new Constructor("ConstructorClass", 500)
    println(aNewConstructor.userInputAge)
  }


class Constructor(name: String, age: Int){
  private var year: Int = 10 

  def userInputForName: String= {
    return (s"The name the user provided was $year")
  }

  def userInputAge: Int = {
    return age + year
  }
 } 
}

// class Constructor(name: String, age: Int){
//   private var year: Int = 10 

//   def userInputForName = {
//     return (s"The name the user provided was $year")
//   }

//   def userInputAge = {
//     return age + year
//   }
// }

// val aNewConstructor = new Constructor("ConstructorClass", 500)
// println(aNewConstructor.userInputAge)