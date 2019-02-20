package com.pheonix.platform.discovery;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PlatformDiscoveryApplication {

	 public static void main(String[] args) {
	        SpringApplication.run(PlatformDiscoveryApplication.class, args);
	    }

}
