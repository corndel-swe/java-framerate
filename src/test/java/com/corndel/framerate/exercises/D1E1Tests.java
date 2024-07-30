package com.corndel.framerate.exercises;

import org.junit.jupiter.api.Test;
import io.javalin.Javalin;
import io.javalin.testtools.JavalinTest;

import static org.assertj.core.api.Assertions.assertThat;

public class D1E1Tests {

    Javalin app = new D1E1().app;

    @Test
    public void GET_index_to_hello_world() {
      JavalinTest.test(app, (server, client) -> {
        var res = client.get("/success.jpg");
        assertThat(res.code()).isEqualTo(200);
        assertThat(res.header("Content-Type")).matches("image\\/jpeg");
      });
    }

}
/*
  describe('GET /success.jpg', function () {
    it('should return 200 OK and the image', async function () {
      const response = await request(app)
        .get('/success.jpg')
        .expect('Content-Type', /image\/jpeg/)
        .expect(200)

      assert.ok(response.body.length > 0, 'Image should not be empty')
    })
  })
   */
