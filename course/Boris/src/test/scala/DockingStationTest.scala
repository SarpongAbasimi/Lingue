import org.scalatest.BeforeAndAfter

class DockingStationTest extends org.scalatest.FunSuite with BeforeAndAfter {

  test("that it responds to release bike"){
    val dockingStation = new DockingStation
    val bike = dockingStation.releaseBike
    assert(bike.isInstanceOf[Bike])
  }

  test("that the docking station can dock a bike"){
    val dockingStation = new DockingStation
    val bike = new Bike
    dockingStation.dock(bike)
    assert(dockingStation.dockedStation.contains(bike))
  }

  test("tha the docking station can dock a bike"){
    val dockingStation = new DockingStation
    val bike = new Bike
    dockingStation.dock(bike)

    assert(dockingStation.dockedStation.length == 1)
  }
}
