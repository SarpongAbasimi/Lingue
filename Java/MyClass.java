public class MyClass{

  public MyClass(){
    System.out.println(" Creating instance of the class");
  }
  public static void main(String[] args) {
    MyClass newClass = new MyClass();
    newClass.eat();
  }

  public void eat(){
    System.out.println("I like to eat Pizza");
  }
}