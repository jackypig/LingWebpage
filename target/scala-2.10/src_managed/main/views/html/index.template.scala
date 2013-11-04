
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
            $(function () """),format.raw/*12.27*/("""{"""),format.raw/*12.28*/("""
                $('#js-news').ticker();
                $('#my_div').cycle("""),format.raw/*14.36*/("""{"""),format.raw/*14.37*/("""
                    fx:    'fade',
                    speed:  2500
                """),format.raw/*17.17*/("""}"""),format.raw/*17.18*/(""");
            """),format.raw/*18.13*/("""}"""),format.raw/*18.14*/(""");
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
        #my_div """),format.raw/*30.17*/("""{"""),format.raw/*30.18*/("""
            width:auto; margin-left:160px;
        """),format.raw/*32.9*/("""}"""),format.raw/*32.10*/("""
        #spaceholder """),format.raw/*33.22*/("""{"""),format.raw/*33.23*/("""
            height:350px;
        """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/("""
    </style>
    <div id="content">
        <ul id="js-news" class="js-hidden">
            <li class="news-item"><a href="#">Dr. Hung's wife Xiaoshu has been pregnant for 21 weeks!</a></li>
            <li class="news-item"><a href="#">Dr. Hung has been published a paper in <em>Physical Review B.</em></a></li>
            <li class="news-item"><a href="#">Congratulations to Dr. Hung's new position in XappMedia as principal software developer!</a></li>
            <li class="news-item"><a href="#">Dr. Hung's paper has been accepted for publication in Jounral Applied Physics.</a></li>
        </ul>
        <div id="my_div" align="center">
            <img src=""""),_display_(Seq[Any](/*45.24*/routes/*45.30*/.Assets.at("images/P1010530.jpg"))),format.raw/*45.63*/("""" class="theLogo"  />
            <img src=""""),_display_(Seq[Any](/*46.24*/routes/*46.30*/.Assets.at("images/P1010484.jpg"))),format.raw/*46.63*/("""" class="theLogo" />
            <img src=""""),_display_(Seq[Any](/*47.24*/routes/*47.30*/.Assets.at("images/VancouverConferences.jpg"))),format.raw/*47.75*/("""" class="theLogo" />
            <img src=""""),_display_(Seq[Any](/*48.24*/routes/*48.30*/.Assets.at("images/Chicago.jpg"))),format.raw/*48.62*/("""" class="theLogo" />
        </div>
        <div id="spaceholder"></div>
        <br>
        <p> I am a Ph.D. candidate in the <a href="http://www.ece.umd.edu/">Department of ECE</a> at <a href="http://www.umd.edu/">University of Maryland, College Park</a>. I am working under the supervision of <a href="http://www.cspl.umd.edu/kjrliu/">Prof. Isaak D. Mayergoyz</a> in the <a href="http://sig.umd.edu/">Magnetic Lab</a> at University of Maryland, College Park since 2009. I received M.S. and B.S. degrees in Electrical Engineering from <a href="http://www.ntu.edu.tw/">National Taiwan University</a>, Taipei, Taiwan.</p>
        <p> My PhD research interest focuses on plasmon resonances in metallic nanoparticles and their applications.</p>
    </div>
""")))})),format.raw/*55.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 02 20:58:40 EDT 2013
                    SOURCE: C:/Users/LingXiaoshu/dev/MyfirstApplication/LingWebpage/app/views/index.scala.html
                    HASH: 84c420f03ab8f503b7c7c86f7aa778305e93de47
                    MATRIX: 723->1|817->18|856->23|902->61|941->63|1030->117|1044->123|1107->165|1203->226|1217->232|1280->273|1482->440|1496->446|1559->488|1649->543|1663->549|1717->582|1808->637|1823->643|1891->689|1996->766|2025->767|2131->845|2160->846|2276->934|2305->935|2349->951|2378->952|2449->995|2478->996|2713->1204|2742->1205|2788->1223|2817->1224|2898->1278|2927->1279|2978->1302|3007->1303|3071->1340|3100->1341|3816->2021|3831->2027|3886->2060|3968->2106|3983->2112|4038->2145|4119->2190|4134->2196|4201->2241|4282->2286|4297->2292|4351->2324|5145->3087
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|40->12|40->12|42->14|42->14|45->17|45->17|46->18|46->18|49->21|49->21|57->29|57->29|58->30|58->30|60->32|60->32|61->33|61->33|63->35|63->35|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|83->55
                    -- GENERATED --
                */
            