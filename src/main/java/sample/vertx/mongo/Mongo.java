package sample.vertx.mongo;

import java.util.List;

import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.mongo.MongoClient;

public class Mongo {
	public static void main(String[] args) {
		Vertx vertx = Vertx.vertx();
		JsonObject config = new JsonObject();
		config.put("db_name", "vertx");
		config.put("connection_string", "mongodb://192.168.1.58:27017");
		MongoClient client = MongoClient.createNonShared(vertx, config);

		JsonObject document = new JsonObject().put("name", "aaa").put("age", 11);
		client.save("user", document, res -> {
			if (res.succeeded()) {
				String id = res.result();
				System.out.println("id : " + id);
			}
		});

		client.find("user", new JsonObject(), res -> {
			if (res.succeeded()) {
				List<JsonObject> list = res.result();
				for (JsonObject object : list) {
					System.out.println(object);
				}
			}
		});
	}
}