package com.corndel.framerate.exercises;

import io.javalin.Javalin;
import io.javalin.http.Context;

public class D1E1 {
  private Javalin app;

  public D1E1() {
    app = Javalin.create().get("/", StaticFileController::get);
  }

  static class StaticFileController {
    public static void get(Context ctx) {}
  }
}
