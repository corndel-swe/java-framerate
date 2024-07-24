package com.corndel.framerate;

import io.javalin.Javalin;

public class App {
  private Javalin app;

  public static void main(String[] args) {
    var javalin = new App().javalinApp();
    javalin.start(8080);
  }

  public App() {
    app = Javalin.create()
        .get("/", HomeController::get);
    app.get("/hello", ctx -> ctx.result("Welcome to the Bleeter server!"));
  }

  public Javalin javalinApp() {
    return app;
  }
}
