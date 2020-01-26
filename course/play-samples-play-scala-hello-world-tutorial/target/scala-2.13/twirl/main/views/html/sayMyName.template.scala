
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object sayMyName extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userName: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("SayMyName")/*2.19*/{_display_(Seq[Any](format.raw/*2.20*/("""
  """),format.raw/*3.3*/("""<div>
      <p>My name is """),_display_(/*4.22*/userName),format.raw/*4.30*/("""</p>
  </div>
""")))}))
      }
    }
  }

  def render(userName:String): play.twirl.api.HtmlFormat.Appendable = apply(userName)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (userName) => apply(userName)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-25T19:39:44.895525
                  SOURCE: /Users/chrissongz/Desktop/practice/course/play-samples-play-scala-hello-world-tutorial/app/views/sayMyName.scala.html
                  HASH: caac53e17bdcc03e9339da2f5368db7909b9e6b1
                  MATRIX: 733->1|845->21|870->38|908->39|937->42|990->69|1018->77
                  LINES: 21->1|26->2|26->2|26->2|27->3|28->4|28->4
                  -- GENERATED --
              */
          