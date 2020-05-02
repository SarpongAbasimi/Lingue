package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.libs.json._
/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
case class UserData(name: String, age: Int, country: String)

object Forms {
  val loginForm = Form(
    mapping(
        "name" -> text(3,10),
        "age" -> number,
        "country" -> text
    )(UserData)(UserData.unapply)
  )
}

@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents, messagesAction: MessagesActionBuilder) extends BaseController with play.api.i18n.I18nSupport  {
  import Forms._

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = messagesAction { implicit messagesRequest: MessagesRequest[AnyContent] =>
    Ok(views.html.index(loginForm))
  }

  def submitForm(): Action[AnyContent] = messagesAction {
    implicit messagesRequest =>
      loginForm.bindFromRequest().fold(formWithErrors => {
        BadRequest(views.html.index(formWithErrors))
      }, userData  => {
        Redirect(routes.HomeController.successPage())
      })

  }

  def successPage() = messagesAction {
    implicit  messagesRequest =>
      Ok("Done")
  }

  def buildApi(): Action[AnyContent] = messagesAction {
    implicit messagesRequest =>
       val ob: JsObject = JsObject(
         Seq(
           "name" -> JsArray(Seq(JsString("Ben"), JsString("Same"))),
           "food" -> JsObject(
             Seq(
               "nameOne" -> JsString("waakye"),
               "nametwo" -> JsString("Banku")
             )
           ),
           "games" -> JsArray(Seq(JsString("FinalFantasy"), JsString("Goku")))
         )
       )
      Ok(ob)
  }
}
