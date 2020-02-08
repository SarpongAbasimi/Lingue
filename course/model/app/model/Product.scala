package models

case class Product(id: Int, name: String, colour: String)

object Product {
  def sortProductsByName = {
    products.toList.sortBy(e => e.id)
  }

  private def products: Set[Product] = {
    Set(
      Product(1, "Milk", "white"),
      Product(2, "Beef", "Red"),
      Product(3, "Farina", "White")
    )
  }
  def findProductGivenTheId(urlParams: String) = {
    products.find{ product =>
      product.id == urlParams.toInt
    }
  }
}