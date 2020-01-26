// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/chrissongz/Desktop/practice/course/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Sun Jan 26 12:07:07 GMT 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
