package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
    public static Result index() {
       return ok(index.render("Your new application is ready"));
      //return redirect("/views/main2.scala.html");
    }

    public static Result Publication() {
        return ok(publications.render());
    }

    public static Result Resume() {
        return ok(resume.render());
    }

    public static Result contact() {
        return ok(Contact.render());
    }

    public static Result Research() {
        return ok(research.render());
    }
}
