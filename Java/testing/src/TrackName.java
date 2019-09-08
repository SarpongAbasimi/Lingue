import java.util.ArrayList;

public class TrackName {
    ArrayList<String> container;

    public  TrackName(){
        this.container = new ArrayList<String>();
    }

    public void addName(String userName){
        this.container.add(userName);
    }

    public ArrayList<String> showNames(){
        return container;
    }
}
