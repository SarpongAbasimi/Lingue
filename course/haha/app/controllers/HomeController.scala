package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import sys.process._
import java.net.URL
import java.io.File
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
//import scala.reflect.io.File

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    val home = System.getProperty("user.home")
    val download = s"$home/Downloads"
    new URL("https://twitter.com/login") #> new File(download)
    Redirect(routes.ProductsController.list)
  }

  def hello(name: String) = Action { implicit request : Request[AnyContent] =>
    Ok(views.html.hello(name))
  }

//  def hi: Action[AnyContent] = Action {
//    implicit request =>
//      Status(200)("Yes yes yes")
//  }

// This wiill ususally be used when fetching data etc
  def hi: Action[AnyContent] = Action.async(Future(Ok("hello it worked")))
}
