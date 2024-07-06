package com.corndel.framerate;

import io.javalin.Javalin;

public class App {
  private Javalin app;

  public static void main(String[] args) {
    var app = new App();
    var actualJavalinApp = app.javalinApp();
    actualJavalinApp.start(8080);
  }

	public App() {
    app = Javalin.create()
      .get("/", HomeController::get);
	}
  
  public Javalin javalinApp() {
    return app;
  }
}
