import java.time.temporal.TemporalAmount

object Card {
  val MAXIMUMBALANCE = 100
}
class Card(var balance: Int = 0) {
  def topUp(amount: Int):Unit ={
    val amountCanTopUp = (amount + balance) - Card.MAXIMUMBALANCE
    val theMessage = s"Maximum balance exceeded, you can only top up $amountCanTopUp"
    if(greaterThanMax(amount)) throw new Exception(theMessage) else (balance = balance + amount)
  }

  def printBalance: Unit = {
    println(balance)
  }

  private def greaterThanMax(amount: Int):Boolean = {
    balance + amount >  Card.MAXIMUMBALANCE
  }
  private def message(amount: Int) = {
    val amountCanTopUp = (amount + balance) - Card.MAXIMUMBALANCE
    println(s"Maximum balance exceeded, you can only top up $amountCanTopUp")
  }
}
