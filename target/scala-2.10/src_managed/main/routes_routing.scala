// @SOURCE:C:/Users/LingXiaoshu/dev/MyfirstApplication/LingWebpage/conf/routes
// @HASH:38d5ee42b8bca8e42e79fcc5a7ab95db5863200c
// @DATE:Mon Oct 21 21:48:29 EDT 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_index1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Index"))))
        

// @LINE:8
private[this] lazy val controllers_Application_Publication2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Publication"))))
        

// @LINE:9
private[this] lazy val controllers_Application_Research3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Research"))))
        

// @LINE:10
private[this] lazy val controllers_Application_Resume4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Resume"))))
        

// @LINE:11
private[this] lazy val controllers_Application_contact5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contact"))))
        

// @LINE:15
private[this] lazy val controllers_Assets_at6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Index""","""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Publication""","""controllers.Application.Publication()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Research""","""controllers.Application.Research()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Resume""","""controllers.Application.Resume()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contact""","""controllers.Application.contact()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_index1(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """Index"""))
   }
}
        

// @LINE:8
case controllers_Application_Publication2(params) => {
   call { 
        invokeHandler(controllers.Application.Publication(), HandlerDef(this, "controllers.Application", "Publication", Nil,"GET", """""", Routes.prefix + """Publication"""))
   }
}
        

// @LINE:9
case controllers_Application_Research3(params) => {
   call { 
        invokeHandler(controllers.Application.Research(), HandlerDef(this, "controllers.Application", "Research", Nil,"GET", """""", Routes.prefix + """Research"""))
   }
}
        

// @LINE:10
case controllers_Application_Resume4(params) => {
   call { 
        invokeHandler(controllers.Application.Resume(), HandlerDef(this, "controllers.Application", "Resume", Nil,"GET", """""", Routes.prefix + """Resume"""))
   }
}
        

// @LINE:11
case controllers_Application_contact5(params) => {
   call { 
        invokeHandler(controllers.Application.contact(), HandlerDef(this, "controllers.Application", "contact", Nil,"GET", """""", Routes.prefix + """contact"""))
   }
}
        

// @LINE:15
case controllers_Assets_at6(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        