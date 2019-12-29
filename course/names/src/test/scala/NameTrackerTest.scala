class NameTrackerTest extends org.scalatest.FunSuite {

  test("it returns a name"){
    val userName: String = "sarpong"
    val nameTracker = new NameTracker
    assert(nameTracker.store(userName) == userName)
  }
}
