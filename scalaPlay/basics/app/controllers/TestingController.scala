package controllers
import play.api._
import com.google.inject.Singleton
import javax.inject.Inject
import play.api.libs.json.{JsValue, Json}

import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents, Request}


object JsonValue {
//  val dat = Json.parse("""{"name": "Ben"}""".stripMargin)
  val dat = Json.parse(
    """ {
       | "name": "Ben",
       | "age" : "23",
       | "country": "some place far away",
       | "project" : "A secret project",
       | "Love story": "Really Bad love story",
       | "fav food" : [
       | {
       | "Banku":"Jollof", "koose":"aburo"}
       | ]
       | }""".stripMargin)

  val data: JsValue = Json.parse("""
  {
    "name" : "Watership Down",
    "location" : {
      "lat" : 51.235685,
      "long" : -1.309197
    },
    "residents" : [ {
      "name" : "Fiver",
      "age" : 4,
      "role" : null
    }, {
      "name" : "Bigwig",
      "age" : 6,
      "role" : "Owsla"
    } ]
  }
  """)
}

case class Person(name: String, age: Int)

@Singleton
class TestingController @Inject() (val controllerComponents: ControllerComponents) extends BaseController {

  def fistAction : Action[AnyContent] = Action {
    implicit request: Request[AnyContent] =>
      val requestBody : Option[JsValue] = request.body.asJson
      val c = for {
        b <- requestBody
      } yield ( b \ "name").as[String]
      Ok(s"My Name is some Name with request Body : => ${requestBody} and c is ${c}")
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
      val body = request.body
      Ok("Got request [" + request + s"] ${body}")
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

  def scalaToJson: Action[AnyContent] = Action {
    implicit request =>
      val numberToJson = Json.toJson[Int](1)
      val seqTOJson = Json.toJson(Seq(1,3,4,5))
      val jsonArrayOfStrings = Json.toJson(List("Fiver", "Bigwig"))
      println(seqTOJson)
      println( jsonArrayOfStrings)
      println(Json.prettyPrint(JsonValue.dat))
      println("---------------------")
      val usingWrite = Json.writes[Person]
      val w = usingWrite.writes(Person("chris", 3))
      println(w)
      Ok(s"The values are ${numberToJson}, ${seqTOJson} and jdata = ${JsonValue.dat}")
  }
}