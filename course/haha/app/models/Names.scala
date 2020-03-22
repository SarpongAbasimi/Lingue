package models

case class Names(fullName: String) extends  AnyVal
object Names {
  private val names: Seq[Names] = Seq(
    Names("yawkofi"),
    Names("BenYaw")
  )

  def fetchNames: Seq[Names] = {
    names
  }

  def searchByName(name: String): Seq[Names] = {
    names.filter(n => n.fullName.contains(name))
  }
}
