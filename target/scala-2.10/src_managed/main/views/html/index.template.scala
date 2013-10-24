
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Ling Hung's Webpage")/*3.40*/ {_display_(Seq[Any](format.raw/*3.42*/("""

    <div id="content">
        <div align="center" id="my_div">
            <img src=""""),_display_(Seq[Any](/*7.24*/routes/*7.30*/.Assets.at("images/IMG_4707.jpg"))),format.raw/*7.63*/("""" class="theLogo" />
        </div>
        <br>
        <p> I am a Ph.D. candidate in the <a href="http://www.ece.umd.edu/">Department of ECE</a> at <a href="http://www.umd.edu/">University of Maryland, College Park</a>. I am working under the supervision of <a href="http://www.cspl.umd.edu/kjrliu/">Prof. Isaak D. Mayergoyz</a> in the <a href="http://sig.umd.edu/">Magnetic Lab</a> at University of Maryland, College Park since 2009. I received M.S. and B.S. degrees in Electrical Engineering from <a href="http://www.ntu.edu.tw/">National Taiwan University</a>, Taipei, Taiwan.</p>
        <p> My PhD research interest focuses on plasmon resonances in metallic nanoparticles and their applications.</p>
    </div>

""")))})),format.raw/*14.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 21 21:49:58 EDT 2013
                    SOURCE: C:/Users/LingXiaoshu/dev/MyfirstApplication/LingWebpage/app/views/index.scala.html
                    HASH: ebaab50e7436b8c93e993ee95e3387ef500babf2
                    MATRIX: 723->1|817->18|854->21|900->59|939->61|1063->150|1077->156|1131->189|1882->909
                    LINES: 26->1|29->1|31->3|31->3|31->3|35->7|35->7|35->7|42->14
                    -- GENERATED --
                */
            