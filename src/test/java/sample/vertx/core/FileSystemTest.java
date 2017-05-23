package sample.vertx.core;

import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.file.FileSystem;
import org.junit.Test;

public class FileSystemTest {

    @Test
    public void test() {
        Vertx vertx = Vertx.vertx();
        FileSystem fs = vertx.fileSystem();
        fs.writeFile("D:/aa.txt", Buffer.buffer("abc"), result -> {
            if (result.succeeded()) {
                System.out.println("Created File");
            }
        });
    }
}