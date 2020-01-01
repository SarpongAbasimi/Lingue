import  collection.mutable.Buffer

class DockingStation(val dockedStation: Buffer[Bike] = collection.mutable.Buffer[Bike]()) {
  
  def releaseBike:Bike ={
    new Bike
  }

  def dock(bike: Bike): Unit = {
    dockedStation.append(bike)
  }
}
