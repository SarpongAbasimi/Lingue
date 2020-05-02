case class One(number: Int) extends AnyVal
case class Two(t: Int) extends AnyVal


object Vc {
  def main(args: Array[String]): Unit = {
    println(add)
  }

  def add = {
    val a = One(4)
    val b= Two(5)
    a + b
  }
}