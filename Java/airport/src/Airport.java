import java.util.ArrayList;

public class Airport {
    ArrayList airportParking;

    public Airport(){
        this.airportParking = new ArrayList();

    }
    public void lands(Plane plane){
        this.airportParking.add(plane);
    }

    public void takeOff(Plane plane){
        this.airportParking.remove(plane);
    }
}
