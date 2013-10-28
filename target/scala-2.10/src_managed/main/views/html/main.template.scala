
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
    <head>
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <meta name="description" content="Ling Hung's homepage." />
        <meta name="keywords" content="Ling, Hung, HAMR, plasmon" />
        <meta name="author" content="Ling Hung" />
        <title>"""),_display_(Seq[Any](/*10.17*/title)),format.raw/*10.22*/("""</title>
        <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*11.55*/routes/*11.61*/.Assets.at("stylesheets/my_style.css"))),format.raw/*11.99*/("""">
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*12.39*/routes/*12.45*/.Assets.at("stylesheets/jquery-ui-1.10.0.custom.css"))),format.raw/*12.98*/("""' />
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*13.46*/routes/*13.52*/.Assets.at("javascripts/http_code.jquery.com_jquery-2.0.0.js"))),format.raw/*13.114*/("""" ></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*14.46*/routes/*14.52*/.Assets.at("javascripts/my_code.js"))),format.raw/*14.88*/(""""></script>
        <script type="text/javascript" src='"""),_display_(Seq[Any](/*15.46*/routes/*15.52*/.Assets.at("javascript/jquery-ui-1.10.0.custom.js"))),format.raw/*15.103*/("""' ></script>
    <style>
        div
        """),format.raw/*18.9*/("""{"""),format.raw/*18.10*/("""
            border:0px solid;
        """),format.raw/*20.9*/("""}"""),format.raw/*20.10*/("""
         /* Look and feel of buttons when not selected */
        .ui-button """),format.raw/*22.20*/("""{"""),format.raw/*22.21*/("""
            background-image: none;
            background-color: #16193B;
       /*     background-color: #4E7AC7;  */
       /*     background-color:#ADD5F7;  */
            color: white; width:100%;
            height: 33px; padding-top: 8px;
            font-size: 16pt;
            border-radius: 5pt;
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/("""
        #header """),format.raw/*32.17*/("""{"""),format.raw/*32.18*/("""
            width:1000px; margin:0 0 0px 0px;
            height:150px; padding-top:30px; padding-left:40px;
      /*      background:transparent url("""),_display_(Seq[Any](/*35.43*/routes/*35.49*/.Assets.at("images/capitolhill.jpg"))),format.raw/*35.85*/(""" top left no-repeat;  */
      /*      background-size:1000px 200px;    */
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/("""
        p.abstract"""),format.raw/*38.19*/("""{"""),format.raw/*38.20*/("""
            font-family: "Times New Roman",
            Times, serif;
            font-size: 1em;
            background-color: gainsboro;
       /*     background-color: #b0c4de;  */
            padding: 20px 10px;
        """),format.raw/*45.9*/("""}"""),format.raw/*45.10*/("""
        #sidebar"""),format.raw/*46.17*/("""{"""),format.raw/*46.18*/("""float:left; width:165px; padding-top: 25px;"""),format.raw/*46.61*/("""}"""),format.raw/*46.62*/("""
        #content """),format.raw/*47.18*/("""{"""),format.raw/*47.19*/("""width:auto; margin-left:190px;"""),format.raw/*47.49*/("""}"""),format.raw/*47.50*/("""
        .contact """),format.raw/*48.18*/("""{"""),format.raw/*48.19*/("""text-align: center;"""),format.raw/*48.38*/("""}"""),format.raw/*48.39*/("""
        h1 """),format.raw/*49.12*/("""{"""),format.raw/*49.13*/("""font-size:4em; padding:0px 0 0 0; margin:0;"""),format.raw/*49.56*/("""}"""),format.raw/*49.57*/("""
        h2 """),format.raw/*50.12*/("""{"""),format.raw/*50.13*/("""font-size:2.4em; margin:0 0 0px 0;"""),format.raw/*50.47*/("""}"""),format.raw/*50.48*/("""
        h3 """),format.raw/*51.12*/("""{"""),format.raw/*51.13*/("""font-size:1.8em;"""),format.raw/*51.29*/("""}"""),format.raw/*51.30*/("""
        p.slogan """),format.raw/*52.18*/("""{"""),format.raw/*52.19*/("""font-size:1.4em;padding:5px 0 15px 40px;"""),format.raw/*52.59*/("""}"""),format.raw/*52.60*/("""
        div.contact"""),format.raw/*53.20*/("""{"""),format.raw/*53.21*/("""text-align:center;"""),format.raw/*53.39*/("""}"""),format.raw/*53.40*/("""
        #footer """),format.raw/*54.17*/("""{"""),format.raw/*54.18*/("""width:680px; clear:both; margin:0px 0 0px 0px; color:#000000; font-size:1em;"""),format.raw/*54.94*/("""}"""),format.raw/*54.95*/("""

        /* Align Period with Experience Title */
        .ExperienceTitle"""),format.raw/*57.25*/("""{"""),format.raw/*57.26*/("""
            float:left;
            font-weight:bold;
        """),format.raw/*60.9*/("""}"""),format.raw/*60.10*/("""
        li.ProfessionExp"""),format.raw/*61.25*/("""{"""),format.raw/*61.26*/("""
            clear:both;
        """),format.raw/*63.9*/("""}"""),format.raw/*63.10*/("""

    </style>
    </head>
    <script type=text/javascript>
        $( "#tabs" ).tabs("""),format.raw/*68.27*/("""{"""),format.raw/*68.28*/("""

        """),format.raw/*70.9*/("""}"""),format.raw/*70.10*/(""");
    </script>

    <body>
        <div id="wrap" style="background-color: whitesmoke" >
            <div id="header">
                <h2>Ling Hung</h2>
                <p class="slogan">Software Developer,<br>
                    XappMedia Inc. Washington, District of Columbia
                </p>
            </div>
            <div id="sidebar">
                <table border="0">
                    <tr><td><a class="ui-button" href="/Index">Home</a></td></tr>
                    <tr><td><a class="ui-button" href="/Resume">Resume</a></td></tr>
                    <tr><td><a class="ui-button" href="/Research">Research</a></td></tr>
                    <tr><td><a class="ui-button" href="/Publication">Publications</a></td></tr>
                    <tr><td><a class="ui-button" href="/contact">Contact</a></td></tr>
                    <tr><td><a href="http://www.linkedin.com/pub/ling-hung/50/140/a8a"><img src=""""),_display_(Seq[Any](/*88.99*/routes/*88.105*/.Assets.at("images/LinkedIn_button.gif"))),format.raw/*88.145*/("""" alt="Join my group on LinkedIn" width="160" height="33" vspace="0" border="0" /></a></td></tr>
                    <tr><td><a href="http://www.twitter.com/eceumd"><img src=""""),_display_(Seq[Any](/*89.80*/routes/*89.86*/.Assets.at("images/twitter_logo.png"))),format.raw/*89.123*/("""" alt="Follow me on Twitter" border="0" vspace="0" /></a></td></tr>
                    <tr><td><a href="https://www.facebook.com/ling.hung.313"><img src=""""),_display_(Seq[Any](/*90.89*/routes/*90.95*/.Assets.at("images/facebook_button.jpg"))),format.raw/*90.135*/("""" alt="Follow me on Facebook" width="160" height="47" vspace="0" border="0" /></a></td></tr>
                </table>
            </div>
            """),_display_(Seq[Any](/*93.14*/content)),format.raw/*93.21*/("""
            <div id="footer">
           <!--     <p>Copyright &copy; Ling Hung 2013 | designed in IntelliJ | last modified: Jul. 2, 2013</p>  !-->
                <p>Copyright &copy; Ling Hung 2013</p>
            </div>
        </div>
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.Html = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 28 13:45:14 EDT 2013
                    SOURCE: /Users/jpk/dev/MyfirstApplication/LingWebpage/app/views/main.scala.html
                    HASH: 620a00209952e25fa117ae4b608dd4c560a435d6
                    MATRIX: 727->1|834->31|1343->504|1370->509|1469->572|1484->578|1544->616|1621->657|1636->663|1711->716|1797->766|1812->772|1897->834|1991->892|2006->898|2064->934|2157->991|2172->997|2246->1048|2318->1093|2347->1094|2413->1133|2442->1134|2548->1212|2577->1213|2920->1529|2949->1530|2994->1547|3023->1548|3211->1700|3226->1706|3284->1742|3394->1825|3423->1826|3470->1845|3499->1846|3751->2071|3780->2072|3825->2089|3854->2090|3925->2133|3954->2134|4000->2152|4029->2153|4087->2183|4116->2184|4162->2202|4191->2203|4238->2222|4267->2223|4307->2235|4336->2236|4407->2279|4436->2280|4476->2292|4505->2293|4567->2327|4596->2328|4636->2340|4665->2341|4709->2357|4738->2358|4784->2376|4813->2377|4881->2417|4910->2418|4958->2438|4987->2439|5033->2457|5062->2458|5107->2475|5136->2476|5240->2552|5269->2553|5372->2628|5401->2629|5491->2692|5520->2693|5573->2718|5602->2719|5662->2752|5691->2753|5806->2840|5835->2841|5872->2851|5901->2852|6862->3777|6878->3783|6941->3823|7153->3999|7168->4005|7228->4042|7420->4198|7435->4204|7498->4244|7684->4394|7713->4401
                    LINES: 26->1|29->1|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|46->18|46->18|48->20|48->20|50->22|50->22|59->31|59->31|60->32|60->32|63->35|63->35|63->35|65->37|65->37|66->38|66->38|73->45|73->45|74->46|74->46|74->46|74->46|75->47|75->47|75->47|75->47|76->48|76->48|76->48|76->48|77->49|77->49|77->49|77->49|78->50|78->50|78->50|78->50|79->51|79->51|79->51|79->51|80->52|80->52|80->52|80->52|81->53|81->53|81->53|81->53|82->54|82->54|82->54|82->54|85->57|85->57|88->60|88->60|89->61|89->61|91->63|91->63|96->68|96->68|98->70|98->70|116->88|116->88|116->88|117->89|117->89|117->89|118->90|118->90|118->90|121->93|121->93
                    -- GENERATED --
                */
            