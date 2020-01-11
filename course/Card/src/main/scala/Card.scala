object Card {
  val MAXIMUMBALANCE = 100
}
class Card(var balance: Int = 0) {
  def add(amount: Int):Unit ={
    balance = balance + amount
  }
}
