
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

    <link rel="stylesheet" type="text/css" href='"""),_display_(Seq[Any](/*5.51*/routes/*5.57*/.Assets.at("stylesheets/ticker-style.css"))),format.raw/*5.99*/("""'  />
    <!--<link rel="stylesheet" type="text/css" href='"""),_display_(Seq[Any](/*6.55*/routes/*6.61*/.Assets.at("stylesheets/tickerstyle.css"))),format.raw/*6.102*/("""'  />-->
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.0/jquery.min.js"></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*8.42*/routes/*8.48*/.Assets.at("javascripts/jquery.ticker.js"))),format.raw/*8.90*/("""" ></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*9.42*/routes/*9.48*/.Assets.at("javascripts/site.js"))),format.raw/*9.81*/("""" ></script>
    <script type="text/javascript">
        $(function () """),format.raw/*11.23*/("""{"""),format.raw/*11.24*/("""
            $('#js-news').ticker();
        """),format.raw/*13.9*/("""}"""),format.raw/*13.10*/(""");
    </script>
    <style>
        ul """),format.raw/*16.12*/("""{"""),format.raw/*16.13*/("""
            margin:0;
            padding:0;
            border:0;
            outline:0;
            font-size:100%;
            vertical-align:baseline;
            background:transparent;
        """),format.raw/*24.9*/("""}"""),format.raw/*24.10*/("""
    </style>

    <div id="content">
        <ul id="js-news" class="js-hidden">
            <li class="news-item"><a href="#">Dr. Hung's wife Xiaoshu has been pregnant for 21 weeks!</a></li>
            <li class="news-item"><a href="#">Dr. Hung has been published a paper in <em>Physical Review B.</em></a></li>
            <li class="news-item"><a href="#">Congratulations to Dr. Hung's new position in XappMedia as principal software developer!</a></li>
            <li class="news-item"><a href="#">Dr. Hung's paper has been accepted for publication in Jounral Applied Physics.</a></li>
        </ul>
        <div align="center" id="my_div">
            <img src=""""),_display_(Seq[Any](/*35.24*/routes/*35.30*/.Assets.at("images/P1010530.jpg"))),format.raw/*35.63*/("""" class="theLogo" />
        </div>
        <br>
        <p> I am a Ph.D. candidate in the <a href="http://www.ece.umd.edu/">Department of ECE</a> at <a href="http://www.umd.edu/">University of Maryland, College Park</a>. I am working under the supervision of <a href="http://www.cspl.umd.edu/kjrliu/">Prof. Isaak D. Mayergoyz</a> in the <a href="http://sig.umd.edu/">Magnetic Lab</a> at University of Maryland, College Park since 2009. I received M.S. and B.S. degrees in Electrical Engineering from <a href="http://www.ntu.edu.tw/">National Taiwan University</a>, Taipei, Taiwan.</p>
        <p> My PhD research interest focuses on plasmon resonances in metallic nanoparticles and their applications.</p>
    </div>

""")))})),format.raw/*42.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 27 21:36:12 EDT 2013
                    SOURCE: C:/Users/Piggy/dev/LingWebpage/app/views/index.scala.html
                    HASH: abb4ce6b54293307a32fecb6c99794d602f04d3d
                    MATRIX: 723->1|817->18|856->23|902->61|941->63|1030->117|1044->123|1107->165|1203->226|1217->232|1280->273|1482->440|1496->446|1559->488|1649->543|1663->549|1717->582|1818->655|1847->656|1921->703|1950->704|2021->747|2050->748|2285->956|2314->957|3032->1639|3047->1645|3102->1678|3860->2405
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|39->11|39->11|41->13|41->13|44->16|44->16|52->24|52->24|63->35|63->35|63->35|70->42
                    -- GENERATED --
                */
            