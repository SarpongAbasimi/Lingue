package models

case class Product(ean: Long, name: String, description: String)

object Product {
  var products = Set(
    Product(50123456423L, "PaperClips Large", "Large Park of 1000"),
    Product(50123456432L, "Giant Paperclips", "Giant Plain 51mm 100 pack"),
    Product(50234754323L, "No Tear Papaer Clip", "No Tear Extra Large Pack of 10000"),
    Product(50234654245L, "Zebra Paperclips", "Zebra Length 28mm Assorted 150 Pack")
  )

  def findAll: List[Product] = products.toList.sortBy(_.ean)
}