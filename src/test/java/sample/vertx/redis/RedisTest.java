package sample.vertx.redis;

import io.vertx.core.Vertx;
import io.vertx.redis.RedisClient;
import io.vertx.redis.RedisOptions;
import org.junit.Test;

public class RedisTest {

    @Test
    public void test() {
        Vertx vertx = Vertx.vertx();
        RedisOptions config = new RedisOptions().setHost("192.168.1.58").setAuth("1234");
        RedisClient client = RedisClient.create(vertx, config);

        client.set("name", "aaa", res -> {
            if (res.succeeded()) {
                System.out.println(res.result());
            }
        });

        client.get("name", res -> {
            if (res.succeeded()) {
                System.out.println(res.result());
            }
        });
    }
}