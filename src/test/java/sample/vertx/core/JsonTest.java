package sample.vertx.core;

import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;
import org.junit.Test;
import sample.vertx.common.RandomUtils;
import sample.vertx.common.User;

import java.util.ArrayList;
import java.util.List;

public class JsonTest {

    @Test
    public void object() {
        JsonObject obj = new JsonObject();
        obj.put("id", RandomUtils.getId());
        obj.put("name", RandomUtils.getName());
        obj.put("age", RandomUtils.getAge());
        obj.put("address", RandomUtils.getAddress());
        obj.put("createdAt", RandomUtils.getCreatedAt());
        System.out.println(obj);
    }

    @Test
    public void clazz() {
        User user = new User();
        user.setId(RandomUtils.getId());
        user.setName(RandomUtils.getName());
        user.setAge(RandomUtils.getAge());
        user.setAddress(RandomUtils.getAddress());
        user.setCreatedAt(RandomUtils.getCreatedAt());
        System.out.println(Json.encode(user));
    }

    @Test
    public void array() {
        List<User> arr = new ArrayList<>(10);
        for (int i = 1; i <= 10; i++) {
            User user = new User();
            user.setId(RandomUtils.getId());
            user.setName(RandomUtils.getName());
            user.setAge(RandomUtils.getAge());
            user.setAddress(RandomUtils.getAddress());
            user.setCreatedAt(RandomUtils.getCreatedAt());
            arr.add(user);
        }
        System.out.println(Json.encodePrettily(arr));
    }
}