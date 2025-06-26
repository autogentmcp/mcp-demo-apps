package com.autogentmcp.weather;

import com.autogentmcp.registry.EnableAutogentMcp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutogentMcp(key = "weather_service", description = "Weather Service for MCP POC")
public class WeatherServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeatherServiceApplication.class, args);
    }
}
