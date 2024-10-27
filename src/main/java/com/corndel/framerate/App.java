package com.corndel.framerate;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class App {
  public static void main(String[] args) {
    var javalin = createApp();
    javalin.start(8080);
  }

  public static Javalin createApp() {
    var app = Javalin.create(
        config -> config.staticFiles.add("/public", Location.CLASSPATH));

    app.get("/hello", ctx -> ctx.result("Welcome to the Bleeter server!"));

    return app;
  }
}
