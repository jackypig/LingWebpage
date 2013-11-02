
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
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*2.42*/routes/*2.48*/.Assets.at("javascripts/jquery.tools.min.js"))),format.raw/*2.93*/(""""></script>
    <script>
        $(function() """),format.raw/*4.22*/("""{"""),format.raw/*4.23*/("""
            $("ul.tabs").tabs("div.panes > div");
        """),format.raw/*6.9*/("""}"""),format.raw/*6.10*/(""");
    </script>
    <style>
        body """),format.raw/*9.14*/("""{"""),format.raw/*9.15*/("""
            padding:50px 80px;
            font-family:"Lucida Grande","bitstream vera sans","trebuchet ms",sans-serif,verdana;
        """),format.raw/*12.9*/("""}"""),format.raw/*12.10*/("""

            /* get rid of those system borders being generated for A tags */
        a:active """),format.raw/*15.18*/("""{"""),format.raw/*15.19*/("""
            outline:none;
        """),format.raw/*17.9*/("""}"""),format.raw/*17.10*/("""

        :focus """),format.raw/*19.16*/("""{"""),format.raw/*19.17*/("""
            -moz-outline-style:none;
        """),format.raw/*21.9*/("""}"""),format.raw/*21.10*/("""
            /* root element for tabs  */
        ul.tabs """),format.raw/*23.17*/("""{"""),format.raw/*23.18*/("""
            list-style:none;
            margin:0 !important;
            padding:0;
            border-bottom:1px solid #666;
            height:30px;
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/("""

            /* single tab */
        ul.tabs li """),format.raw/*32.20*/("""{"""),format.raw/*32.21*/("""
            float:left;
            text-indent:0;
            padding:0;
            margin:0 !important;
            list-style-image:none !important;
        """),format.raw/*38.9*/("""}"""),format.raw/*38.10*/("""

            /* link inside the tab. uses a background image */
        ul.tabs a """),format.raw/*41.19*/("""{"""),format.raw/*41.20*/("""
            background: url(""""),_display_(Seq[Any](/*42.31*/routes/*42.37*/.Assets.at("images/blue.png"))),format.raw/*42.66*/("""") no-repeat -420px 0;
            font-size:11px;
            display:block;
            height: 30px;
            line-height:30px;
            width: 134px;
            text-align:center;
            text-decoration:none;
            color:#333;
            padding:0px;
            margin:0px;
            position:relative;
            top:1px;
        """),format.raw/*55.9*/("""}"""),format.raw/*55.10*/("""

        ul.tabs a:active """),format.raw/*57.26*/("""{"""),format.raw/*57.27*/("""
            outline:none;
        """),format.raw/*59.9*/("""}"""),format.raw/*59.10*/("""

            /* when mouse enters the tab move the background image */
        ul.tabs a:hover """),format.raw/*62.25*/("""{"""),format.raw/*62.26*/("""
            background-position: -420px -31px;
            color:#fff;
        """),format.raw/*65.9*/("""}"""),format.raw/*65.10*/("""

            /* active tab uses a class name "current". its highlight is also done by moving the background image. */
        ul.tabs a.current, ul.tabs a.current:hover, ul.tabs li.current a """),format.raw/*68.74*/("""{"""),format.raw/*68.75*/("""
            background-position: -420px -62px;
            cursor:default !important;
            color:#000 !important;
        """),format.raw/*72.9*/("""}"""),format.raw/*72.10*/("""

            /* Different widths for tabs: use a class name: w1, w2, w3 or w2 */

            /* width 1 */
        ul.tabs a.s """),format.raw/*77.21*/("""{"""),format.raw/*77.22*/(""" background-position: -553px 0; width:81px; """),format.raw/*77.66*/("""}"""),format.raw/*77.67*/("""
        ul.tabs a.s:hover """),format.raw/*78.27*/("""{"""),format.raw/*78.28*/(""" background-position: -553px -31px; """),format.raw/*78.64*/("""}"""),format.raw/*78.65*/("""
        ul.tabs a.s.current  """),format.raw/*79.30*/("""{"""),format.raw/*79.31*/(""" background-position: -553px -62px; """),format.raw/*79.67*/("""}"""),format.raw/*79.68*/("""

            /* width 2 */
        ul.tabs a.l """),format.raw/*82.21*/("""{"""),format.raw/*82.22*/(""" background-position: -248px -0px; width:174px; """),format.raw/*82.70*/("""}"""),format.raw/*82.71*/("""
        ul.tabs a.l:hover """),format.raw/*83.27*/("""{"""),format.raw/*83.28*/(""" background-position: -248px -31px; """),format.raw/*83.64*/("""}"""),format.raw/*83.65*/("""
        ul.tabs a.l.current """),format.raw/*84.29*/("""{"""),format.raw/*84.30*/(""" background-position: -248px -62px; """),format.raw/*84.66*/("""}"""),format.raw/*84.67*/("""

            /* width 3 */
        ul.tabs a.xl """),format.raw/*87.22*/("""{"""),format.raw/*87.23*/(""" background-position: 0 -0px; width:248px; """),format.raw/*87.66*/("""}"""),format.raw/*87.67*/("""
        ul.tabs a.xl:hover """),format.raw/*88.28*/("""{"""),format.raw/*88.29*/(""" background-position: 0 -31px; """),format.raw/*88.60*/("""}"""),format.raw/*88.61*/("""
        ul.tabs a.xl.current """),format.raw/*89.30*/("""{"""),format.raw/*89.31*/(""" background-position: 0 -62px; """),format.raw/*89.62*/("""}"""),format.raw/*89.63*/("""

            /* initially all panes are hidden */
        .panes .pane """),format.raw/*92.22*/("""{"""),format.raw/*92.23*/("""
            display:none;
        """),format.raw/*94.9*/("""}"""),format.raw/*94.10*/("""
        .panes div """),format.raw/*95.20*/("""{"""),format.raw/*95.21*/("""
            display:none;
            padding:15px 10px;
            border:1px solid #999;
            border-top:0;
            height:100px;
            font-size:14px;
            background-color:#fff;
        """),format.raw/*103.9*/("""}"""),format.raw/*103.10*/("""
    </style>

    <ul class="tabs">
        <li><a href="#">HAMR</a></li>
        <li><a href="#">SERS</a></li>
        <li><a href="#">AOMR</a></li>
    </ul>
    <div class="panes">
        <div>pane 1 content</div>
        <div>pane 2 content</div>
        <div>pane 3 content</div>
    </div>
""")))})),format.raw/*116.2*/("""
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 02 15:42:28 EDT 2013
                    SOURCE: C:/Users/LingXiaoshu/dev/MyfirstApplication/LingWebpage/app/views/research.scala.html
                    HASH: ef5c90d7a329bfa8e7d997ac6f73b6e33e70561a
                    MATRIX: 799->1|830->24|869->26|947->69|961->75|1027->120|1102->168|1130->169|1217->230|1245->231|1317->276|1345->277|1512->417|1541->418|1668->517|1697->518|1761->555|1790->556|1837->575|1866->576|1941->624|1970->625|2058->685|2087->686|2281->853|2310->854|2391->907|2420->908|2615->1076|2644->1077|2758->1163|2787->1164|2855->1196|2870->1202|2921->1231|3319->1602|3348->1603|3405->1632|3434->1633|3498->1670|3527->1671|3654->1770|3683->1771|3793->1854|3822->1855|4045->2050|4074->2051|4235->2185|4264->2186|4426->2320|4455->2321|4527->2365|4556->2366|4612->2394|4641->2395|4705->2431|4734->2432|4793->2463|4822->2464|4886->2500|4915->2501|4994->2552|5023->2553|5099->2601|5128->2602|5184->2630|5213->2631|5277->2667|5306->2668|5364->2698|5393->2699|5457->2735|5486->2736|5566->2788|5595->2789|5666->2832|5695->2833|5752->2862|5781->2863|5840->2894|5869->2895|5928->2926|5957->2927|6016->2958|6045->2959|6148->3034|6177->3035|6241->3072|6270->3073|6319->3094|6348->3095|6600->3319|6630->3320|6974->3632
                    LINES: 29->1|29->1|29->1|30->2|30->2|30->2|32->4|32->4|34->6|34->6|37->9|37->9|40->12|40->12|43->15|43->15|45->17|45->17|47->19|47->19|49->21|49->21|51->23|51->23|57->29|57->29|60->32|60->32|66->38|66->38|69->41|69->41|70->42|70->42|70->42|83->55|83->55|85->57|85->57|87->59|87->59|90->62|90->62|93->65|93->65|96->68|96->68|100->72|100->72|105->77|105->77|105->77|105->77|106->78|106->78|106->78|106->78|107->79|107->79|107->79|107->79|110->82|110->82|110->82|110->82|111->83|111->83|111->83|111->83|112->84|112->84|112->84|112->84|115->87|115->87|115->87|115->87|116->88|116->88|116->88|116->88|117->89|117->89|117->89|117->89|120->92|120->92|122->94|122->94|123->95|123->95|131->103|131->103|144->116
                    -- GENERATED --
                */
            