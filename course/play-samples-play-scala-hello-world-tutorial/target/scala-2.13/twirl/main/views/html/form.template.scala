
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

object form extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Forms")/*1.15*/{_display_(Seq[Any](format.raw/*1.16*/("""
 """),format.raw/*2.2*/("""<div>
     <form method="post" action="formSubmit">
         <label>Name</label>
         <input type="text"/>
         <label>Country</label>
         <input type="text"/>
         <input type="submit"/>
     </form>
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
                  DATE: 2020-01-26T12:04:04.073680
                  SOURCE: /Users/chrissongz/Desktop/practice/course/play-samples-play-scala-hello-world-tutorial/app/views/form.scala.html
                  HASH: c64f2942db683a21c1acc05ee6af1984f964d099
                  MATRIX: 810->1|831->14|869->15|897->17
                  LINES: 26->1|26->1|26->1|27->2
                  -- GENERATED --
              */
          