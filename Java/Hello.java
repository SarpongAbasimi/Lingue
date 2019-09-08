import java.util.ArrayList;

public class Hello {
    ArrayList<String> nameContainer;

    public Hello(){
        this.nameContainer = new ArrayList<String>();
    }

    public String sayHello(String userName){
        return("Hello " + userName);
    }

    public void addToNameContainer(String name){
        this.nameContainer.add(name);
    }

    public static void main(String[] args) {
      Hello newHello = new Hello();
      newHello.addToNameContainer("sarpong");
    }
}