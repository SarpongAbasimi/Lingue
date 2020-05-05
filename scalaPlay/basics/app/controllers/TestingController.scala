package controllers
import play.api._
import com.google.inject.Singleton
import javax.inject.Inject
import play.api.libs.json.JsValue
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}

@Singleton
class TestingController @Inject() (val controllerComponents: ControllerComponents) extends BaseController {

  def fistAction : Action[AnyContent] = Action {
    Ok("My Name is some Name")
  }

  def secondAction: Action[AnyContent] = Action {
    request => Ok("Good")
  }

  def thirdAction: Action[AnyContent] = Action {
    implicit request =>
      Ok("That is the impict One")
  }

  def fourthAction: Action[JsValue] = Action(parse.json) {
    implicit  request =>
      Ok("Got request [" + request + "]")
  }

  def handlingResponse: Action[AnyContent] = Action {
    implicit request =>
      Ok("My name is name").as(JSON)
  }

  def save: Action[AnyContent] = Action {
    implicit request =>
      Redirect(routes.TestingController.flashing).flashing("Flask" -> "Did it work")
  }

  def flashing: Action[AnyContent] = Action {
    implicit request =>
      Ok{
//        request.flash.get("Flask").getOrElse("Welcome")
        views.html.flash()

      }
  }
}
