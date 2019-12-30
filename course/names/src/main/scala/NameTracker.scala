object Container {
  var container: List[String] = List();

  def main(args: Array[String]): Unit = {
    val nameOfPeopleIhaveMet = new NameTracker
    nameOfPeopleIhaveMet.store("chris")
    nameOfPeopleIhaveMet.store("sarp")
    nameOfPeopleIhaveMet.printNames
  }
}

class NameTracker {

  def store(personYouMeetName: String) : Unit = {
    Container.container = personYouMeetName :: Container.container
  }

  def getContainerLength:Int = {
    Container.container.length
  }

  def printNames: Unit = {
    Container.container.foreach(name => println(name))
  }
}
