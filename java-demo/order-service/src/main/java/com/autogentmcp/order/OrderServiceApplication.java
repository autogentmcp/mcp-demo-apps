package com.autogentmcp.order;

import com.autogentmcp.registry.EnableAutogentMcp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutogentMcp(key = "app_x29iirgfycp9e92iqkb04", description = "Order Tracking Service for MCP POC")
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}
