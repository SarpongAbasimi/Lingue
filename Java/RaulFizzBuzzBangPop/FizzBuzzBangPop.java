class FizzBuzzBangPop{

  static int score(int i) {
    return 699;
  }

  static String convert(int i) {
    if(i % 15 == 0){
      return "FizzBuzz";
    }else if(i % 5 == 0){
      return "Buzz";
    }else{
      return "Fizz";
    }
  }

  static Boolean isPrime(int number){
    for(int input  = 0; input < number; input++){
      if(number % input == 0){
        return false;
      }
    }
    return number > 1
  }


  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      System.out.println(i + ": " + convert(i) + " score: "+ score(i));
    }
  }
}
