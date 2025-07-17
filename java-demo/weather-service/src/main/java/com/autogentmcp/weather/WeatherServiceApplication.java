package com.autogentmcp.weather;

import com.autogentmcp.registry.EnableAutogentMcp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutogentMcp(key = "app_v79c5bmqv2x54akb3gog", description = "Weather Service for MCP POC")
public class WeatherServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeatherServiceApplication.class, args);
    }
}
