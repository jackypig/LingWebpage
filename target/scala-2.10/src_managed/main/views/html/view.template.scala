
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
object view extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(url: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.15*/("""
<div class="myLink">
    Go to: """),_display_(Seq[Any](/*3.13*/Html(url))),format.raw/*3.22*/(""" <br>
    not to: """),_display_(Seq[Any](/*4.14*/url)),format.raw/*4.17*/("""
</div>"""))}
    }
    
    def render(url:String): play.api.templates.Html = apply(url)
    
    def f:((String) => play.api.templates.Html) = (url) => apply(url)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 02 20:49:38 EDT 2013
                    SOURCE: C:/Users/LingXiaoshu/dev/MyfirstApplication/LingWebpage/app/views/view.scala.html
                    HASH: c44c1371fedbc54ebba6c0978a19125155641aab
                    MATRIX: 722->1|812->14|883->50|913->59|968->79|992->82
                    LINES: 26->1|29->1|31->3|31->3|32->4|32->4
                    -- GENERATED --
                */
            