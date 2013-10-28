
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
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*10.42*/routes/*10.48*/.Assets.at("javascripts/jquery.cycle2.min.js"))),format.raw/*10.94*/("""" ></script>
    <script type="text/javascript">
        $(function () """),format.raw/*12.23*/("""{"""),format.raw/*12.24*/("""
            $('#js-news').ticker();
            $('#fade').cycle("""),format.raw/*14.30*/("""{"""),format.raw/*14.31*/("""
                fx:    'fade',
                speed:  2500
            """),format.raw/*17.13*/("""}"""),format.raw/*17.14*/(""");
        """),format.raw/*18.9*/("""}"""),format.raw/*18.10*/(""");
    </script>
    <style>
        ul """),format.raw/*21.12*/("""{"""),format.raw/*21.13*/("""
            margin:0;
            padding:0;
            border:0;
            outline:0;
            font-size:100%;
            vertical-align:baseline;
            background:transparent;
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/("""
    </style>

    <div id="content">
        <ul id="js-news" class="js-hidden">
            <li class="news-item"><a href="#">Dr. Hung's wife Xiaoshu has been pregnant for 21 weeks!</a></li>
            <li class="news-item"><a href="#">Dr. Hung has been published a paper in <em>Physical Review B.</em></a></li>
            <li class="news-item"><a href="#">Congratulations to Dr. Hung's new position in XappMedia as principal software developer!</a></li>
            <li class="news-item"><a href="#">Dr. Hung's paper has been accepted for publication in Jounral Applied Physics.</a></li>
        </ul>
        <div id="my_div" align="center">
            <img src=""""),_display_(Seq[Any](/*40.24*/routes/*40.30*/.Assets.at("images/P1010530.jpg"))),format.raw/*40.63*/("""" class="theLogo" />
            <!--<img src=""""),_display_(Seq[Any](/*41.28*/routes/*41.34*/.Assets.at("images/P1010484.jpg"))),format.raw/*41.67*/("""" class="theLogo" />-->
            <!--<img src=""""),_display_(Seq[Any](/*42.28*/routes/*42.34*/.Assets.at("images/VancouverConferences.jpg"))),format.raw/*42.79*/("""" class="theLogo" />-->
            <!--<img src=""""),_display_(Seq[Any](/*43.28*/routes/*43.34*/.Assets.at("images/Chicago.jpg"))),format.raw/*43.66*/("""" class="theLogo" />-->
        </div>
        <br>
        <div>
            <p> I am a Ph.D. candidate in the <a href="http://www.ece.umd.edu/">Department of ECE</a> at <a href="http://www.umd.edu/">University of Maryland, College Park</a>. I am working under the supervision of <a href="http://www.cspl.umd.edu/kjrliu/">Prof. Isaak D. Mayergoyz</a> in the <a href="http://sig.umd.edu/">Magnetic Lab</a> at University of Maryland, College Park since 2009. I received M.S. and B.S. degrees in Electrical Engineering from <a href="http://www.ntu.edu.tw/">National Taiwan University</a>, Taipei, Taiwan.</p>
            <p> My PhD research interest focuses on plasmon resonances in metallic nanoparticles and their applications.</p>
        </div>
    </div>

""")))})),format.raw/*52.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 28 13:44:52 EDT 2013
                    SOURCE: /Users/jpk/dev/MyfirstApplication/LingWebpage/app/views/index.scala.html
                    HASH: 20bee9f65786b3d27f6c961e26e6653b903706bb
                    MATRIX: 723->1|817->18|854->21|900->59|939->61|1026->113|1040->119|1103->161|1198->221|1212->227|1275->268|1475->433|1489->439|1552->481|1641->535|1655->541|1709->574|1799->628|1814->634|1882->680|1981->751|2010->752|2104->818|2133->819|2234->892|2263->893|2301->904|2330->905|2398->945|2427->946|2654->1146|2683->1147|3390->1818|3405->1824|3460->1857|3544->1905|3559->1911|3614->1944|3701->1995|3716->2001|3783->2046|3870->2097|3885->2103|3939->2135|4730->2895
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|40->12|40->12|42->14|42->14|45->17|45->17|46->18|46->18|49->21|49->21|57->29|57->29|68->40|68->40|68->40|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|80->52
                    -- GENERATED --
                */
            