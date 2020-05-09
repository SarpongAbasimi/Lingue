package controllers

import com.google.inject.Singleton
import javax.inject.Inject
import play.api.libs.ws._
import play.api.libs.ws.WSResponse
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents, Result}
import play.api.libs.json._
import play.api.libs.json.Reads

import scala.concurrent.Future
import scala.concurrent.ExecutionContext

case class Example(userId: Int, id: Int, title: String, completed: Boolean)
@Singleton
class Ha @Inject() (val controllerComponents: ControllerComponents, ws: WSClient)(implicit ec: ExecutionContext ) extends BaseController {
  def firstRest(): Action[AnyContent] = Action.async {
    val uri: String = "https://jsonplaceholder.typicode.com/todos/1"
    val request: Future[WSResponse] = ws.url(uri).get()
    val getJson : Future[JsValue] = request.map(_.json)
    implicit val makeREAD :Reads[Example] = Json.reads[Example]
    val ca= getJson.map(json => {
      Json.fromJson[Example](json)
    })

    ca.map(e => {
      e.map(b => println(b))
    })
    getJson.map(Ok(_))

  }
}