import java.util.ArrayList;

public class Airport {
    ArrayList airportParking;

    public Airport(){
        this.airportParking = new ArrayList();

    }
    public void lands(Plane plane){
        this.airportParking.add(plane);
    }

    public Boolean takeOff(Plane plane){
        return true;
    }
}
