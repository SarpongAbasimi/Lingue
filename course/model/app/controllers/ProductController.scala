package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.Product

@Singleton
class ProductController @Inject()(val controllerComponents: ControllerComponents) extends BaseController{

  def products = Action{ request: Request[AnyContent] => 
     val products = Product.sortProductsByName
     Ok(views.html.products(products))
  }

  def show(id: String) = Action { implicit request: Request[AnyContent] =>
    Product.findProductGivenTheId(id).map{
      product => Ok(views.html.show(product))
    }.getOrElse(NotFound)
  }
}