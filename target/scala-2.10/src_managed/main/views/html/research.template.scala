
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
        /*body """),format.raw/*9.16*/("""{"""),format.raw/*9.17*/("""*/
            /*padding:50px 80px;*/
            /*font-family:"Lucida Grande","bitstream vera sans","trebuchet ms",sans-serif,verdana;*/
            /*font: "Times New Roman";*/
        /*"""),format.raw/*13.11*/("""}"""),format.raw/*13.12*/("""*/

            /* get rid of those system borders being generated for A tags */
        a:active """),format.raw/*16.18*/("""{"""),format.raw/*16.19*/("""
            outline:none;
        """),format.raw/*18.9*/("""}"""),format.raw/*18.10*/("""

        :focus """),format.raw/*20.16*/("""{"""),format.raw/*20.17*/("""
            -moz-outline-style:none;
        """),format.raw/*22.9*/("""}"""),format.raw/*22.10*/("""
            /* root element for tabs  */
        ul.tabs """),format.raw/*24.17*/("""{"""),format.raw/*24.18*/("""
            list-style:none;
            /*margin:0 !important;*/
            margin-left: 200px;
            margin-top: 0px;
            padding:0;
            border-bottom:1px solid #666;
            height:30px;
        """),format.raw/*32.9*/("""}"""),format.raw/*32.10*/("""

             /*single tab */
        ul.tabs li """),format.raw/*35.20*/("""{"""),format.raw/*35.21*/("""
            float:left;
            text-indent:0;
            padding:0;
            margin:0 !important;
            list-style-image:none !important;
        """),format.raw/*41.9*/("""}"""),format.raw/*41.10*/("""

            /* link inside the tab. uses a background image */
        ul.tabs a """),format.raw/*44.19*/("""{"""),format.raw/*44.20*/("""
            background: url(""""),_display_(Seq[Any](/*45.31*/routes/*45.37*/.Assets.at("images/blue.png"))),format.raw/*45.66*/("""") no-repeat -420px 0;
            font-size:14px;
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
            top:20px;
        """),format.raw/*58.9*/("""}"""),format.raw/*58.10*/("""

        ul.tabs a:active """),format.raw/*60.26*/("""{"""),format.raw/*60.27*/("""
            outline:none;
        """),format.raw/*62.9*/("""}"""),format.raw/*62.10*/("""

            /* when mouse enters the tab move the background image */
        ul.tabs a:hover """),format.raw/*65.25*/("""{"""),format.raw/*65.26*/("""
            background-position: -420px -31px;
            color:#fff;
        """),format.raw/*68.9*/("""}"""),format.raw/*68.10*/("""

            /* active tab uses a class name "current". its highlight is also done by moving the background image. */
        ul.tabs a.current, ul.tabs a.current:hover, ul.tabs li.current a """),format.raw/*71.74*/("""{"""),format.raw/*71.75*/("""
            background-position: -420px -62px;
            cursor:default !important;
            color:#000 !important;
        """),format.raw/*75.9*/("""}"""),format.raw/*75.10*/("""

            /* Different widths for tabs: use a class name: w1, w2, w3 or w2 */

            /* width 1 */
        ul.tabs a.s """),format.raw/*80.21*/("""{"""),format.raw/*80.22*/(""" background-position: -553px 0; width:81px; """),format.raw/*80.66*/("""}"""),format.raw/*80.67*/("""
        ul.tabs a.s:hover """),format.raw/*81.27*/("""{"""),format.raw/*81.28*/(""" background-position: -553px -31px; """),format.raw/*81.64*/("""}"""),format.raw/*81.65*/("""
        ul.tabs a.s.current  """),format.raw/*82.30*/("""{"""),format.raw/*82.31*/(""" background-position: -553px -62px; """),format.raw/*82.67*/("""}"""),format.raw/*82.68*/("""

            /* width 2 */
        ul.tabs a.l """),format.raw/*85.21*/("""{"""),format.raw/*85.22*/(""" background-position: -248px -0px; width:174px; """),format.raw/*85.70*/("""}"""),format.raw/*85.71*/("""
        ul.tabs a.l:hover """),format.raw/*86.27*/("""{"""),format.raw/*86.28*/(""" background-position: -248px -31px; """),format.raw/*86.64*/("""}"""),format.raw/*86.65*/("""
        ul.tabs a.l.current """),format.raw/*87.29*/("""{"""),format.raw/*87.30*/(""" background-position: -248px -62px; """),format.raw/*87.66*/("""}"""),format.raw/*87.67*/("""

            /* width 3 */
        ul.tabs a.xl """),format.raw/*90.22*/("""{"""),format.raw/*90.23*/(""" background-position: 0 -0px; width:248px; """),format.raw/*90.66*/("""}"""),format.raw/*90.67*/("""
        ul.tabs a.xl:hover """),format.raw/*91.28*/("""{"""),format.raw/*91.29*/(""" background-position: 0 -31px; """),format.raw/*91.60*/("""}"""),format.raw/*91.61*/("""
        ul.tabs a.xl.current """),format.raw/*92.30*/("""{"""),format.raw/*92.31*/(""" background-position: 0 -62px; """),format.raw/*92.62*/("""}"""),format.raw/*92.63*/("""

            /* initially all panes are hidden */
        .panes .pane """),format.raw/*95.22*/("""{"""),format.raw/*95.23*/("""
            display:none;
        """),format.raw/*97.9*/("""}"""),format.raw/*97.10*/("""
        .panes div """),format.raw/*98.20*/("""{"""),format.raw/*98.21*/("""
            display:none;
            margin-left: 170px;
            padding:15px 10px;
            border:1px solid #999;
            border-top:0px;
            height:auto;
            font-size:14px;
            background-color:#fff;
        """),format.raw/*107.9*/("""}"""),format.raw/*107.10*/("""
    </style>
    <div>
        <ul class="tabs">
            <li><a href="#tabs-1">HAMR</a></li>
            <li><a href="#tabs-2">SERS</a></li>
            <li><a href="#tabs-3">AOMR</a></li>
            <li><a href="#tabs-4">RadCor</a></li>
        </ul>
        <div class="panes">
            <div id="tabs-1">"""),_display_(Seq[Any](/*117.31*/HAMR("HAMR"))),format.raw/*117.43*/("""</div>
            <div id="tabs-2">"""),_display_(Seq[Any](/*118.31*/SERS("SERS"))),format.raw/*118.43*/("""</div>
            <div id="tabs-3">"""),_display_(Seq[Any](/*119.31*/AOMR("AOMR"))),format.raw/*119.43*/("""</div>
            <div id="tabs-4">"""),_display_(Seq[Any](/*120.31*/Radiation("Radiation Correction"))),format.raw/*120.64*/("""</div>
        </div>
    </div>
""")))})),format.raw/*123.2*/("""
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 03 21:15:25 EST 2013
                    SOURCE: C:/Users/LingXiaoshu/dev/MyfirstApplication/LingWebpage/app/views/research.scala.html
                    HASH: 404d6992e4ea9c1b276f443fe15fef672cf27860
                    MATRIX: 799->1|830->24|869->26|947->69|961->75|1027->120|1102->168|1130->169|1217->230|1245->231|1319->278|1347->279|1569->473|1598->474|1727->575|1756->576|1820->613|1849->614|1896->633|1925->634|2000->682|2029->683|2117->743|2146->744|2407->978|2436->979|2517->1032|2546->1033|2741->1201|2770->1202|2884->1288|2913->1289|2981->1321|2996->1327|3047->1356|3446->1728|3475->1729|3532->1758|3561->1759|3625->1796|3654->1797|3781->1896|3810->1897|3920->1980|3949->1981|4172->2176|4201->2177|4362->2311|4391->2312|4553->2446|4582->2447|4654->2491|4683->2492|4739->2520|4768->2521|4832->2557|4861->2558|4920->2589|4949->2590|5013->2626|5042->2627|5121->2678|5150->2679|5226->2727|5255->2728|5311->2756|5340->2757|5404->2793|5433->2794|5491->2824|5520->2825|5584->2861|5613->2862|5693->2914|5722->2915|5793->2958|5822->2959|5879->2988|5908->2989|5967->3020|5996->3021|6055->3052|6084->3053|6143->3084|6172->3085|6275->3160|6304->3161|6368->3198|6397->3199|6446->3220|6475->3221|6761->3479|6791->3480|7154->3806|7189->3818|7264->3856|7299->3868|7374->3906|7409->3918|7484->3956|7540->3989|7609->4026
                    LINES: 29->1|29->1|29->1|30->2|30->2|30->2|32->4|32->4|34->6|34->6|37->9|37->9|41->13|41->13|44->16|44->16|46->18|46->18|48->20|48->20|50->22|50->22|52->24|52->24|60->32|60->32|63->35|63->35|69->41|69->41|72->44|72->44|73->45|73->45|73->45|86->58|86->58|88->60|88->60|90->62|90->62|93->65|93->65|96->68|96->68|99->71|99->71|103->75|103->75|108->80|108->80|108->80|108->80|109->81|109->81|109->81|109->81|110->82|110->82|110->82|110->82|113->85|113->85|113->85|113->85|114->86|114->86|114->86|114->86|115->87|115->87|115->87|115->87|118->90|118->90|118->90|118->90|119->91|119->91|119->91|119->91|120->92|120->92|120->92|120->92|123->95|123->95|125->97|125->97|126->98|126->98|135->107|135->107|145->117|145->117|146->118|146->118|147->119|147->119|148->120|148->120|151->123
                    -- GENERATED --
                */
            