package com.shard;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShardingJdbcApplication {

	public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ShardingJdbcApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
	}

}
