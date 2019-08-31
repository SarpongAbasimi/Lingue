
import java.util.Arrays;

public class Reverse{

  // public Reverse(){

  // }

  public String[] revese(String inputWord){
    String [] splitUserInput = inputWord.split("");
    return splitUserInput;
  }

  public static void main(String[] args) {
    Reverse newReverse = new Reverse();
    String[] myCall = newReverse.revese("hello");
    System.out.println(Arrays.toString(myCall));
  }
}