package com.corndel.framerate.exercises;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;
import io.javalin.rendering.template.JavalinThymeleaf;

public class D2E3 {
  public static Javalin createApp() {
    var app = Javalin.create(
        config -> {
          config.staticFiles.add("/exercises/public", Location.CLASSPATH);
          config.fileRenderer(new JavalinThymeleaf());
        });

    app.get(
        "/d2e3",
        ctx -> {
          ctx.render("d2e3.html");
        });

    app.post(
        "/submit",
        ctx -> {
          // TODO: Open d2e3.html and follow the instructions

          // TODO: get the `name` and `email` from the form so that the below response
          // works

          var name = "";
          var email = "";

          ctx.result("Received: " + name + ", " + email);
        });

    return app;
  }
}
