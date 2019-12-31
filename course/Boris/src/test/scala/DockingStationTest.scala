import org.scalatest.BeforeAndAfter

class DockingStationTest extends org.scalatest.FunSuite with BeforeAndAfter {

  test("that it responds to release bike"){
    val dockingStation = new DockingStation
    val bike = new Bike
    assert(dockingStation.releaseBike == bike)
  }
}
