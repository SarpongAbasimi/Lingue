package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.Product

class ProductsController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  def list = Action { implicit request: Request[AnyContent] =>
    val products = Product.findAll
    Ok(views.html.products.list(products))
  }
}