public class Person {
    private String name;

    public Person(String userName){
        this.name = userName;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }
}
