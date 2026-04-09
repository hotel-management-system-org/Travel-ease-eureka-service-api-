package com.travel_ease.hotel_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceApiApplication.class, args);

		System.out.println("""
            ╔══════════════════════════════════════════════════════╗
            ║   🏨 Hotel Management - Eureka Server Started! 🏨   ║
            ║                                                      ║
            ║   Dashboard: http://localhost:8761                   ║
            ║   Status: ✅ Service Discovery Active                ║
            ╚══════════════════════════════════════════════════════╝
            """);

	}

}
