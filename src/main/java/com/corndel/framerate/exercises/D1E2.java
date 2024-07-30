package com.corndel.framerate.exercises;

import java.util.Collections;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;

public class D1E2 {
  public Javalin app;

  public D1E2() {
    app =
        Javalin.create(
            config -> {
              config.fileRenderer(new JavalinJte());
            });
    app.get("/", ctx -> {
      var message = "Hello from d1e2!";
      ctx.render("d1e2.jte", Collections.singletonMap("message", message));
    });
  }
}
