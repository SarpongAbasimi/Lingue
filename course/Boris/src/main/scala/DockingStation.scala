import  collection.mutable.Buffer

class DockingStation(val dockedStation: Buffer[Bike] = collection.mutable.Buffer[Bike]()) {

  def releaseBike:Bike = {
    val exceptionMessage: String = " There are no bikes available"
    if (dockedStation.length < 1) throw new Exception(exceptionMessage) else new Bike
  }

  def dock(bike: Bike): Unit = {
    dockedStation.append(bike)
  }
}
