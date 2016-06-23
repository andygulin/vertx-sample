package sample.vertx.core;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

public class Json {
	public static void main(String[] args) {
		JsonObject obj = new JsonObject().put("name", "aaa").put("age", 111);
		System.out.println(obj);
		System.out.println(obj.getString("name"));
		System.out.println(obj.getInteger("age"));

		JsonArray arr = new JsonArray();
		arr.add(new JsonObject().put("name", "aaa").put("age", 11));
		arr.add(new JsonObject().put("name", "bbb").put("age", 12));
		System.out.println(arr);
	}
}
