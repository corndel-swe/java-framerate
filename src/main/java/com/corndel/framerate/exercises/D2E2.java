package com.corndel.framerate.exercises;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;
import io.javalin.rendering.template.JavalinThymeleaf;

public class D2E2 {
  public static Javalin createApp() {
    var app = Javalin.create(
        config -> {
          config.staticFiles.add("/exercises/public", Location.CLASSPATH);
          config.fileRenderer(new JavalinThymeleaf());
        });

    app.get(
        "/d2e2",
        ctx -> {
          // TODO: Render 'd2e2.html'
          // TODO: Open d2e2.html and follow the instructions
        });

    return app;
  }
}
