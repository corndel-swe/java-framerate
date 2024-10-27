package com.corndel.framerate.exercises;

import java.util.Map;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinThymeleaf;

public class D1E2 {

  public static Javalin createApp() {
    var app = Javalin.create(
        config -> {
          config.fileRenderer(new JavalinThymeleaf());
        });

    app.get(
        "/d1e2",
        ctx -> {
          var message = "Hello from d1e2!";
          ctx.render("exercises/templates/d1e2.html", Map.of("message", message));
        });

    return app;
  }
}
