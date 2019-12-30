//abstract class Container {
//  var container : List[String] = List("dsp");
//}

object Container {
  var container: List[String] = List();
}

class NameTracker {

  def store(personYouMeetName: String) : Unit = {
    Container.container = personYouMeetName :: Container.container
  }

  def getContainerLength:Int = {
    Container.container.length
  }
}
