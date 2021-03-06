package com.pheonix.platform.configuration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class PlatformConfigurationApplication {

	 public static void main(String[] args) {
	        SpringApplication.run(PlatformConfigurationApplication.class, args);
	    }

}
