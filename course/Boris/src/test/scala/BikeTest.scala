class BikeTest extends org.scalatest.FunSuite {
  test("That bike responds to working"){
    val bike = new Bike
    assert(bike.working == true)
  }
}
