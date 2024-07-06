package com.corndel.framerate;

import org.junit.jupiter.api.Test;
import io.javalin.http.BadRequestResponse;
import io.javalin.http.Context;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

public class AppUnitTests {

  private final Context ctx = mock(Context.class);

  @Test
  public void GET_index_returns_200() {
    HomeController.get(ctx);
    verify(ctx).result("Hello, World!");
  }

}
