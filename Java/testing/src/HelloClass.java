import java.util.ArrayList;

public class HelloClass {
    ArrayList<String> nameContainer;

    public HelloClass(){
        this.nameContainer = new ArrayList<String>();
    }

    public String sayHello(String userName){
        return("Hello " + userName);
    }

    public void addToNameContainer(String name){
        this.nameContainer.add(name);
    }
}
