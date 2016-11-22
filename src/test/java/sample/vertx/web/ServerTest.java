package sample.vertx.web;

import org.junit.Test;

import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

public class ServerTest {

	@Test
	public void test() {
		Vertx vertx = Vertx.vertx();
		Router router = Router.router(vertx);

		router.route().handler(routingContext -> {
			routingContext.response().putHeader("content-type", "text/html").end("Hello World!");
		});

		vertx.createHttpServer().requestHandler(router::accept).listen(8080);
	}
}