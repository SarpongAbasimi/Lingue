
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

object formRedirect extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Form Redirect page")/*1.28*/{_display_(Seq[Any](format.raw/*1.29*/("""
 """),format.raw/*2.2*/("""<div>
     You have been redirect here after for submitted
 </div>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-26T11:41:10.307147
                  SOURCE: /Users/chrissongz/Desktop/practice/course/play-samples-play-scala-hello-world-tutorial/app/views/formRedirect.scala.html
                  HASH: 0ede493ba1aa998f903e3d6d6785d8e9ec6aefea
                  MATRIX: 818->1|852->27|890->28|918->30
                  LINES: 26->1|26->1|26->1|27->2
                  -- GENERATED --
              */
          