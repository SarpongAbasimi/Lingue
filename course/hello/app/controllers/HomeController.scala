package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import java.util.Date
import java.text.SimpleDateFormat
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
    val date = new Date()
    val formatDate = new SimpleDateFormat().format(date)
    Ok(views.html.index(formatDate ))
  }
}
