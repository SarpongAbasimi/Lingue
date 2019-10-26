class Constructor(name: String, age: Int){
  private var year: Int = 10 

  def userInputForName = {
    return (s"The name the user provided was $year")
  }

  def userInputAge = {
    return age + year
  }
}

val aNewConstructor = new Constructor("ConstructorClass", 500)
println(aNewConstructor.userInputAge)