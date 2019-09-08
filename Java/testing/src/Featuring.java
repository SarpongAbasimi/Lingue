public class Featuring {
    public static void main(String[] args){
        DockingStation dockingStation = new DockingStation();
        Bikes bike = dockingStation.releaseBike();
        System.out.println(bike.working());
    }
}
