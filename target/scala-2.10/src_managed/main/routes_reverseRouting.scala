// @SOURCE:/Users/jpk/dev/MyfirstApplication/LingWebpage/conf/routes
// @HASH:38d5ee42b8bca8e42e79fcc5a7ab95db5863200c
// @DATE:Sun Oct 27 22:49:40 EDT 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:15
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def Research(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "Research")
}
                                                

// @LINE:8
def Publication(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "Publication")
}
                                                

// @LINE:10
def Resume(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "Resume")
}
                                                

// @LINE:7
// @LINE:6
def index(): Call = {
   () match {
// @LINE:6
case () if true => Call("GET", _prefix)
                                                        
// @LINE:7
case () if true => Call("GET", _prefix + { _defaultPrefix } + "Index")
                                                        
   }
}
                                                

// @LINE:11
def contact(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "contact")
}
                                                
    
}
                          

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:15
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def Research : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.Research",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Research"})
      }
   """
)
                        

// @LINE:8
def Publication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.Publication",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Publication"})
      }
   """
)
                        

// @LINE:10
def Resume : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.Resume",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Resume"})
      }
   """
)
                        

// @LINE:7
// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Index"})
      }
      }
   """
)
                        

// @LINE:11
def contact : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.contact",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
      }
   """
)
                        
    
}
              

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:15
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def Research(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.Research(), HandlerDef(this, "controllers.Application", "Research", Seq(), "GET", """""", _prefix + """Research""")
)
                      

// @LINE:8
def Publication(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.Publication(), HandlerDef(this, "controllers.Application", "Publication", Seq(), "GET", """""", _prefix + """Publication""")
)
                      

// @LINE:10
def Resume(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.Resume(), HandlerDef(this, "controllers.Application", "Resume", Seq(), "GET", """""", _prefix + """Resume""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:11
def contact(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.contact(), HandlerDef(this, "controllers.Application", "contact", Seq(), "GET", """""", _prefix + """contact""")
)
                      
    
}
                          

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
                  
      