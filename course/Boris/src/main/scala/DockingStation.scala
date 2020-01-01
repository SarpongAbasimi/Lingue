import  collection.mutable.Buffer

class DockingStation(
                      val dockedStation: Buffer[Bike] = collection.mutable.Buffer[Bike](),
                      val maxCapacity:Int = 20
                    ) {

  @throws(classOf[Exception])
  def releaseBike:Unit = {
    val exceptionMessage: String = " There are no bikes available"
    if (isEmpty) throw new Exception(exceptionMessage) else new Bike
  }

  @throws(classOf[Exception])
  def dock(bike: Bike): Unit = {
    val message: String = "The docking station is full"
    if(isFull) throw  new Exception(message) else dockedStation.append(bike)
  }

  private def isEmpty:Boolean = {
    dockedStation.isEmpty
  }

  private def isFull:Boolean = {
    dockedStation.length >= maxCapacity
  }
}
