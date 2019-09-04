import java.util.ArrayList;

public class TrackName {
    ArrayList<String> container;

    public  TrackName(){
        container = new ArrayList<String>();
    }

    public void addName(String userName){
        container.add(userName);
    }

    public ArrayList<String> showNames(){
        return container;
    }
}
