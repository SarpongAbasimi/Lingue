import java.util.ArrayList;

public class DockingStation {
    ArrayList<String> bikesAvailable;

    public  void DockingStation(){
        this.bikesAvailable = new ArrayList<String>();
    }

    public Bikes releaseBike(){
        Bikes bike = new Bikes();
        return bike;
    }
    public void dock(String b){
        this.bikesAvailable.add(b);
    }

    public static void main(String[] args) {
    }
}
