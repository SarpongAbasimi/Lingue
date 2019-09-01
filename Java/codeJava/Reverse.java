
import java.util.Arrays;
import java.util.ArrayList;

// link ->  https://www.codewars.com/kata/reversed-words/train/java
public class Reverse{

  public String revese(String inputWord){
    String[] splitUserInput = inputWord.split(" ");
    String stringConcat = "";
    for(int index = splitUserInput.length; index > 0; index--){
      stringConcat += splitUserInput[index - 1];
      stringConcat += " ";
    }
    System.out.println(stringConcat);
    return stringConcat;
  }

  public static void main(String[] args) {
    Reverse newReverse = new Reverse();
    newReverse.revese("hello my");
  }
}