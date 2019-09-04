import java.util.ArrayList;

public class TrackName {
    ArrayList<String> container;

    public  TrackName(){
        container = new ArrayList<String>();
    }

    public boolean addName(String userName){
        return container.add(userName);
    }
}
