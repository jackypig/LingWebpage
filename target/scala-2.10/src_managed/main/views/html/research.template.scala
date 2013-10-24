
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
object research extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("Ling's Research")/*1.25*/ {_display_(Seq[Any](format.raw/*1.27*/("""
    <div id="tabs" style="margin-left:auto;margin-right:auto;width: 950px">
        <ul>
            <li><a href="#tabs-basic">General</a></li>
            <li><a href="#tabs-main-audio">Creative</a></li>
            <li id="tab-button-xapp"><a href="#tabs-xapp">Xapp</a></li>
        </ul>
    </div>
""")))})),format.raw/*9.2*/("""
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 21 21:49:58 EDT 2013
                    SOURCE: C:/Users/LingXiaoshu/dev/MyfirstApplication/LingWebpage/app/views/research.scala.html
                    HASH: e8574ce5b0efaa1a53360f187e1e1fb69bb59af2
                    MATRIX: 799->1|830->24|869->26|1211->338
                    LINES: 29->1|29->1|29->1|37->9
                    -- GENERATED --
                */
            