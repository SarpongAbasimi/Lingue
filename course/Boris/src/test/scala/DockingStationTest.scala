import org.scalatest.BeforeAndAfter

class DockingStationTest extends org.scalatest.FunSuite with BeforeAndAfter {

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

  test("that it throws an error when there is no bike to release"){
    val dockingStation = new DockingStation
    assertThrows[Exception]({
      dockingStation.releaseBike
    })
  }

  test("that only one one bike can be docked at a docking station"){
    val firstBike = new Bike
    val secondBike = new Bike
    val dockingStation = new DockingStation()

    dockingStation.dock(firstBike)

    assertThrows[Exception]({
      dockingStation.dock(secondBike)
    })
  }
}
