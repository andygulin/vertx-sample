package sample.vertx.common;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.time.DateUtils;

public class RandomUtils {

	private RandomUtils() {
	}

	public static String getId() {
		return UUID.randomUUID().toString().replace("-", "");
	}

	public static int getAge() {
		return org.apache.commons.lang3.RandomUtils.nextInt(10, 100);
	}

	public static String getName() {
		return RandomStringUtils.random(10, "abcdefghijklmnopqrstuvwxyz1234567890");
	}

	public static String getAddress() {
		final String[] addrs = { "shanghai", "beijing", "guangzhou", "nanjing", "xianggang", "hunan", "hubei" };
		return addrs[org.apache.commons.lang3.RandomUtils.nextInt(0, addrs.length)];
	}

	public static Instant getCreatedAt() {
		Date date = DateUtils.addDays(new Date(), org.apache.commons.lang3.RandomUtils.nextInt(1, 100));
		return Instant.ofEpochMilli(date.getTime());
	}
}
