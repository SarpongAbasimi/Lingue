import javax.management.RuntimeErrorException;
import java.util.ArrayList;

public class DockingStation {
    private final byte CAPACITY = 20;
    ArrayList<Bike> bikesAvailable;

    public DockingStation(){
        this.bikesAvailable = new ArrayList<Bike>();
    }

    public void dockBike(Bike bike){
        if(fullCapacity()){
            throw new RuntimeException("Maximum capacity of: " + CAPACITY + " Reached");
        }
        this.bikesAvailable.add(bike);
    }

    public Bike releaseBike(){
        if (noBike()){
            throw new RuntimeException("There are no bikes available");
        }
        Bike bike = new Bike();
        return bike;
    }

    public byte getCapacity(){
        return CAPACITY;
    }

    public static void main(String[] args) {
        Bike newBike = new Bike();
        DockingStation newDockingStation = new DockingStation();
        newDockingStation.dockBike(newBike);
        System.out.println(newDockingStation.bikesAvailable);
    }

    private Boolean fullCapacity(){
        return this.bikesAvailable.size() > 20;
    }
    private Boolean noBike(){
        return this.bikesAvailable.size() == 0;
    }
}
