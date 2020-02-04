package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import java.util.Date
import java.text.SimpleDateFormat
import scala.concurrent.Future
import play.api.libs.ws._
import scala.concurrent.ExecutionContext.Implicits.global

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(ws: WSClient, val controllerComponents: ControllerComponents) extends BaseController {

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

  def makeRequest() = Action.async {
    val url: String = "https://jsonplaceholder.typicode.com/posts/1"
    val requestData = ws.url(url).get()
    Future.successful{
    requestData.map {
      response => 
      val j = response.json
      println(j)
      j
    }
    }
    Future.successful { Ok(views.html.data())}
  }
}
