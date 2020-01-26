package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents, Request}

@Singleton
class FormController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def applicationForm(): Action[AnyContent] = Action {
    implicit  request: Request[AnyContent] =>
      Ok(views.html.form())
  }

  def applicationFormSubmit(): Action[AnyContent] = Action {
    implicit request: Request[AnyContent] =>
      Ok(views.html.formRedirect())
  }

  def applicationSubmit(): Action[AnyContent] = Action {
    Redirect("/afterLogin")
  }
}