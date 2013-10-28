
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object Contact extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("Ling's Contact")/*1.24*/ {_display_(Seq[Any](format.raw/*1.26*/("""

    <div id="content" class="contact">
        Ling Hung<br>
        Department of Electrical and Computer Engineering<br>
        University of Maryland, College Park, MD 20742<br>
        Office: 2348 A.V. Williams Bldg.<br>
        Phone: 301-405-7540<br>
        Email: jackypig at umd dot edu
    </div>

""")))})))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 27 22:49:41 EDT 2013
                    SOURCE: /Users/jpk/dev/MyfirstApplication/LingWebpage/app/views/Contact.scala.html
                    HASH: ea27cc0e7e087405302c566b7f0d719acbb5c23a
                    MATRIX: 798->1|828->23|867->25
                    LINES: 29->1|29->1|29->1
                    -- GENERATED --
                */
            