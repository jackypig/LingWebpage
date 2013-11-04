
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
object main2 extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

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
    <title>"""),_display_(Seq[Any](/*10.13*/title)),format.raw/*10.18*/("""</title>
    <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*11.51*/routes/*11.57*/.Assets.at("stylesheets/my_style.css"))),format.raw/*11.95*/("""">
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*12.42*/routes/*12.48*/.Assets.at("javascripts/http_code.jquery.com_jquery-2.0.0.js"))),format.raw/*12.110*/("""" ></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*13.42*/routes/*13.48*/.Assets.at("javascripts/my_code.js"))),format.raw/*13.84*/(""""></script>
</head>

<body>
<div id="wrap">
    <div id="header">
        <h2>Ling Hung</h2>
        <p class="slogan">Research Assistant,<br>
            Dept ECE, Univ Maryland, College Park
        </p>
    </div>

    <div id="sidebar">
        <ul>
            <li><a href="index.html">Home</a></li>
            <br>
            <li><a href="Resume.html">Resume</a></li>
            <br>
            <li><a href="Research.html">Research</a></li>
            <br>
            <li><a href="Publications.html">Publications</a></li>
            <br>
            <li><a href="Contact.html">Contact</a></li>
            <br>
            <li><a href="http://www.linkedin.com/pub/ling-hung/50/140/a8a"><img src=""""),_display_(Seq[Any](/*37.87*/routes/*37.93*/.Assets.at("images/LinkedIn_button.gif"))),format.raw/*37.133*/("""" alt="Join my group on LinkedIn" width="160" height="33" vspace="2" border="0" /></a></li>
            <li><a href="http://www.twitter.com/eceumd"><img src=""""),_display_(Seq[Any](/*38.68*/routes/*38.74*/.Assets.at("images/twitter_logo.png"))),format.raw/*38.111*/("""" alt="Follow me on Twitter" border="0" vspace="8" /></a><br >
            </li>
            <li><a href="https://www.facebook.com/ling.hung.313"><img src=""""),_display_(Seq[Any](/*40.77*/routes/*40.83*/.Assets.at("images/facebook_button.jpg"))),format.raw/*40.123*/("""" alt="Follow me on Facebook" width="160" height="47" vspace="2" border="0" /></a><br>
            </li>
            <br>
        </ul>
    </div>

    <div id="content">
        <div align="center" id="my_div">
            <img src=""""),_display_(Seq[Any](/*48.24*/routes/*48.30*/.Assets.at("images/IMG_4707.jpg"))),format.raw/*48.63*/("""" class="theLogo" />
        </div>
        <br>
        <p> I am a Ph.D. candidate in the <a href="http://www.ece.umd.edu/">Department of ECE</a> at <a href="http://www.umd.edu/">University of Maryland, College Park</a>. I am working under the supervision of <a href="http://www.cspl.umd.edu/kjrliu/">Prof. K.J. Ray Liu</a> in the <a href="http://sig.umd.edu/">Signals and Information Group</a> at University of Maryland, College Park since 2009. I received M.S. and B.S. degrees in Electrical Engineering from <a href="http://www.ntu.edu.tw/">National Taiwan University</a>, Taipei, Taiwan.</p>
        <p> My current research interest focuses on plasmon resonances in metallic nanoparticles and their applications.</p>
    </div>
    <div id="footer">
        <p>Copyright &copy; Ling Hung 2013 | designed in IntelliJ | last modified: Jul. 2, 2013</p>
    </div>
</div>


</body>
</html>"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.Html = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 02 20:49:37 EDT 2013
                    SOURCE: C:/Users/LingXiaoshu/dev/MyfirstApplication/LingWebpage/app/views/main2.scala.html
                    HASH: fd86f29661e40e17cdeb8d668c7c72d62b406949
                    MATRIX: 728->1|835->31|1329->489|1356->494|1452->554|1467->560|1527->598|1608->643|1623->649|1708->711|1799->766|1814->772|1872->808|2642->1542|2657->1548|2720->1588|2916->1748|2931->1754|2991->1791|3186->1950|3201->1956|3264->1996|3543->2239|3558->2245|3613->2278
                    LINES: 26->1|29->1|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|65->37|65->37|65->37|66->38|66->38|66->38|68->40|68->40|68->40|76->48|76->48|76->48
                    -- GENERATED --
                */
            