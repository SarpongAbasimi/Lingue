class NameTrackerTest extends org.scalatest.FunSuite {

  test("it adds a name to the container"){
    val userName: String = "sarpong"
    val nameTracker = new NameTracker
    nameTracker.store(userName);
    assert(nameTracker.getContainerLength == 1)
  }

  test(" it can add two names to the container"){
    val  usernames = ("chris", "songz")
    val nameTracker = new NameTracker
    nameTracker.store(usernames._1)
    assert(nameTracker.getContainerLength == 2)
  }
}
