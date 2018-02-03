package com.elevysi.site.soa.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfBootApplication.class, args);
	}
}
