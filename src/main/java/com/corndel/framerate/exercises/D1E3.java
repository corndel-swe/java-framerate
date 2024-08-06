package com.corndel.framerate.exercises;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.resolve.ResourceCodeResolver;
import io.javalin.Javalin;
import java.util.List;

public class D1E3 {
  public Javalin app;

  public D1E3() {
    app =
        Javalin.create(
            config -> {
              var codeResolver = new ResourceCodeResolver("exercises/templates");
              var templateEngine = TemplateEngine.create(codeResolver, ContentType.Html);

              // TODO: Configure the app to use EJS as the view engine
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
          // TODO: Render 'd1e3.jte', passing the value of `shopping`

          // TODO: Open d1e3.ejs and follow the instructions
        });
  }
}
