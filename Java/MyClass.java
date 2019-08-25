public class MyClass{

  int numberOfStudents;

  public MyClass(int numStudents){
    System.out.println(" Creating instance of the class");
    numberOfStudents = numStudents;
  }
  public static void main(String[] args) {
    MyClass newClass = new MyClass(10);
    System.out.println(newClass.numberOfStudents);
  }

  public void eat(){
    System.out.println("I like to eat Pizza");
  }
}