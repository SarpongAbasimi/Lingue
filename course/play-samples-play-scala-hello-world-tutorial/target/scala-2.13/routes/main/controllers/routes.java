// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/chrissongz/Desktop/practice/course/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Sun Jan 26 12:07:07 GMT 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseFormController FormController = new controllers.ReverseFormController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseFormController FormController = new controllers.javascript.ReverseFormController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
