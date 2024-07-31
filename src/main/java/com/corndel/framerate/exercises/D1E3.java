package com.corndel.framerate.exercises;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.resolve.ResourceCodeResolver;
import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import java.util.Collections;
import java.util.List;

public class D1E3 {
  public Javalin app;

  public D1E3() {
    app =
        Javalin.create(
            config -> {
              var codeResolver = new ResourceCodeResolver("templates");
              var templateEngine = TemplateEngine.create(codeResolver, ContentType.Html);
              config.fileRenderer(new JavalinJte(templateEngine));
            });

    app.get(
        "/d1e3",
        ctx -> {
          var shopping =
              List.of(
                  "Eggs",
                  "Flour",
                  "Sugar",
                  "Lifesize cutout of Christian Bale as Batman",
                  "Milk",
                  "Bread");

          // TODO Write prompt and remove answer
          ctx.render("exercises/d1e3.jte", Collections.singletonMap("shopping", shopping));
        });
  }
}
