class CardTest extends org.scalatest.FlatSpec {
  "A card" should " allow money to be added to it" in {
    val card = new Card
    val amount = 4
    card.add(amount)
    assert(card.balance === 4)
  }
}
