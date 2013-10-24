
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
object resume extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("Ling's Resume")/*1.23*/ {_display_(Seq[Any](format.raw/*1.25*/("""

    <div id="content">
        <ul>
            <li class="resume"><h2>Education Background</h2></li>
            <ul class="resume">
                <br>
                <li>Ph.D. in Electrical Engineering, University of Maryland, College Park, 2013</li>
                <li>M.S. in Photonics and Optoelectronics Engineering, National Taiwan University, 2006</li>
                <li>B.S. in Electrical Engineering, National Taiwan University, Taiwan, 2004</li>
            </ul>
            <br>
            <br>
            <li class="resume"><h2>Skill Summary</h2></li>
            <ul class="resume">
                <br>
                <li>CAD software: Blender, ZEMAX, SolidWorks, AutoCAD, Lumerical.</li>
                <li>Computer/programming: Windows/Unix, MATLAB, C/C++, FORTRAN, Mathematica, Origin, Java, Javascript, CSS, html, ajax, JSON, MySQL, NoSQL, scala, Play framework</li>
                <li>Lab equipment: He-Cd laser, Ti:Sapphire mode-locked laser, cryostat, monochromator, chopper, lock-in amplifier, BBO crystal, spectrometer.</li>
                <li>Scientific writing: research papers, routine data reports</li>
            </ul>
            <br>
            <br>
            <li class="resume"><h2>Professional Experience</h2></li>
            <ul class="resume">
                <br>
                <li class="ProfessionExp"><div class="ExperienceTitle">Experience on software development and numerical analysis:</div>
                    <div class="period" style="text-align: right">01/2009 - Present</div>
                    <ul>
                        <li>Developed a boundary element method (BEM) based software package for surface plasmon simulation for heat assisted magnetic
                            recording (HAMR).</li>
                        <li>Designed three dimension meshes of different nanoparticle geometries for nanoscale near-field optical irradiation probes.</li>
                        <li>Developed a software package based on Usmani's method for computing the tridiagonal matrix inversion.</li>
                        <li>Derived analytical solutions of plasmon modes for various nanoparticles and provided them as the test examples for numerical
                            computations.</li>
                        <li>Optimized developed software by using MEX files and parallel computing (GPU) to boost computation speed.</li>
                        <li>Implemented in-house developed algorithm for computation of radiation corrections for plasmon resonances in nanoparticles.</li>
                    </ul>
                </li>
                <br>
                <li class="ProfessionExp"><div class="ExperienceTitle">Research on modeling of nanoscale optical phenomenon and devices:</div>
                    <div class="period" style="text-align: right">01/2009 - Present</div>
                    <ul>
                        <li>Designed near-field transducers (NFTs) for generating nanoscale optical spots for HAMR.</li>
                        <li>Investigated the effect of heat sink layers on optical spots generated by aperture-type NFTs and NFTs with protruding parts.</li>
                        <li>Derived analytical solutions of dipolar plasmon modes in metallic nanoparticles with rotational symmetry for all-optical magnetic
                            recording.</li>
                        <li>Conducted research on plasmon resonances in silver nanocube dimers on silicon substrate for surface enhanced Raman scattering
                            (SERS) used in bio-sensing application.</li>
                    </ul>
                </li>
                <br>
                <li class="ProfessionExp"><div class="ExperienceTitle">Teaching on power electronics and power system:</div>
                    <div class="period" style="text-align: right">01/2012 - Present</div>
                    <ul>
                        <li>Teaching assistant, Power System (ENEE474) and Power electronics (ENEE475), ECE Department, University of Maryland, College Park, fall 2012 & spring 2013.</li>
                    </ul>
                </li>
                <br>
                <li class="ProfessionExp"><div class="ExperienceTitle">Optical Lens Design Engineer: (Suyin Corporation, Taiwan)</div>
                    <div class="period" style="text-align: right">06/2007 - 06/2008</div>
                    <ul>
                        <li>Designed near-field transducers (NFTs) for generating nanoscale optical spots for HAMR.</li>
                        <li>Investigated the effect of heat sink layers on optical spots generated by aperture-type NFTs and NFTs with protruding parts.</li>
                        <li>Derived analytical solutions of dipolar plasmon modes in metallic nanoparticles with rotational symmetry for all-optical magnetic
                            recording.</li>
                        <li>Conducted research on plasmon resonances in silver nanocube dimers on silicon substrate for surface enhanced Raman scattering
                            (SERS) used in bio-sensing application.</li>
                    </ul>
                </li>
                <br>
                <li class="ProfessionExp"><div class="ExperienceTitle">Research on next generation white light LED and optical fiber:</div>
                    <div class="period" style="text-align: right">09/2004 - 06/2006</div>
                    <ul>
                        <li>Conducted optical experiment of photoluminescence (PL), photo-energy-dependent PL, and time-resolved PL on mixed
                            InGaN/GaN quantum well structures for generation of white light.</li>
                        <li>Designed a photonic crystal fiber (PCF) with a ring structure and solved for different propagating modes by using finite
                            element method (FEM).</li>
                    </ul>
                </li>
                <br>
                <li class="ProfessionExp"><div class="ExperienceTitle">Lab Instructor: (Nanoscience Lab, National Taiwan University)</div>
                    <div class="period" style="text-align: right">02/2005 - 06/2006</div>
                    <ul>
                        <li>Taught the physical mechanism beyond photoluminescence and directed senior students to perform hands-on optical
                            measurement of GaN and ZnO thin films.</li>
                    </ul>
                </li>
            </ul>
            <br>
            <br>
            <li class="resume"><h2>Graduate Courses</h2></li>
            <ul class="resume">
                <br>
                <li>Electromagnetic Theory, Optoelectronic Electromagnetics , Magnetism and Magnetic Technology.</li>
                <li>Quantum Mechanics, Solid State Electronics, Quantum Electronics.</li>
                <li>Experimental Methods in Materials Science, Advanced Electrical and Optical Materials.</li>
                <li>Fourier Transform and Fourier Optics, Optical System Design, Microwave Engineering.</li>
                <li>Fundamentals of Lasers, Display Technologies, Nonlinear Optics.</li>
            </ul>
            <br>
            <br>
            <li class="resume"><h2>Extracurricular Activities</h2></li>
            <br>
            <li class="ProfessionExp"><div class="ExperienceTitle">Graduate Student Government, ECE Representative</div>
                <div class="period" style="text-align: right">08/2012 - Present</div>
                <ul>
                    <li>Serve as secretary in Legislative Action Committee to consult with the Chairperson on the order
                        of business for the meeting, record key points of issues discussed in the meeting, and convey the ideas between committee members.</li>
                </ul>
            </li>
            <br>
            <li class="ProfessionExp"><div class="ExperienceTitle">Music Bands in Taiwanese/Chinese Student Association, leading guitarist</div>
                <div class="period" style="text-align: right">01/2009 - 01/2012</div>
                <ul>
                    <li>Established two bands and provided performances for various occasions, such as Independence Day (in front of White House),
                        Chinese New Year, mid-autumn festival, ECE International Day, etc.</li>
                </ul>
            </li>
            <br>
            <li class="ProfessionExp"><div class="ExperienceTitle">NTU Guitar Club, Vice President</div>
                <div class="period" style="text-align: right">06/2002 - 12/2002</div>
                <ul>
                    <li>Assisted the president in planning and organizing club activities; conducted a once-in-a-semester performance called “The Folk Night” and invited well-known signers and guitarists to be the special guests</li>
                </ul>
            </li>
        </ul>
    </div>
""")))})),format.raw/*129.2*/("""


"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 21 21:59:30 EDT 2013
                    SOURCE: C:/Users/LingXiaoshu/dev/MyfirstApplication/LingWebpage/app/views/resume.scala.html
                    HASH: 1064d96ce0991b3d8e1be3791e1cccd916fd9e67
                    MATRIX: 797->1|826->22|865->24|9945->9072
                    LINES: 29->1|29->1|29->1|157->129
                    -- GENERATED --
                */
            