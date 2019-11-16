object Odd{

  def main(args: Array[Strings]){
    
  }

  def oddCount(n: Long): Long = {
    val userInput: Long = n
    
    for(element <- 1 to userInput if element % 2 !=0)
      yield element.toLong
  }
}