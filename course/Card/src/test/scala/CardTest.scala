class CardTest extends org.scalatest.FlatSpec {
  "A card" should "can be topped up" in {
    val card = new Card
    val amount = 4
    card.topUp(amount)
    assert(card.balance === 4)
  }

  "A card " should "have a maximum threshold" in {
    val card = new Card
    val amount = 99
    card.topUp(amount)
    assertThrows[Exception]({
      card.topUp(6)
    })
  }
}
