package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.Product
import models.Names
import play.api.libs.json.JsValue

class ProductsController @Inject()(val controllerComponents: ControllerComponents,
                                   configuration: Configuration
                                  ) extends BaseController {
  def list: Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    val products = Product.findAll
    Ok(views.html.products.list(products))
  }

  def productOwnersNames: Action[AnyContent] = Action {
    implicit request: Request[AnyContent] =>
      val names = Names.fetchNames
      Ok(views.html.products.names(names))
  }

  def getName(name: String): Action[AnyContent] = Action {
    implicit request: Request[AnyContent] =>
      val result: Boolean = Names.searchByName(name).isEmpty
      result match {
        case true => NoContent
        case _ => Ok(views.html.products.namee(Names.searchByName(name)))
      }
  }

  def postProduct: Action[AnyContent] = Action {
    implicit request: Request[AnyContent] =>
      val requestBody: AnyContent = request.body
      val requestContentType: Option[String] = requestBody.asText
      requestContentType.map(e => {
        println(s"Body:  $requestBody")
        println(e)
        Ok(s"Item in Body $e")
      }).getOrElse(BadRequest("Improper request Body"))
  }

  def h: Action[String] = Action(parse.text){
      implicit request =>
      Ok(s"dfd $request")
  }

//  def postProduct: Action[JsValue] = Action(parse.json) {
//    implicit request: Request[JsValue] =>
//      val requestBody: JsValue = request.body
//      val requestContentType: JsValue = requestBody
//      val nam = (requestBody \ "name").as[String]
//      println(s"Name => $nam")
//      println(s"Body => $requestBody")
//      Ok(requestContentType)
//  }

}