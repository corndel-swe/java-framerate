package com.corndel.framerate;

import io.javalin.http.Context;

/**
 * HomeController
 */
public class HomeController {

  public static void get(Context ctx) {
    ctx.result("Hello, World!");
  }
}
