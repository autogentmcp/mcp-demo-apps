package com.autogentmcp.user;

import com.autogentmcp.registry.EnableAutogentMcp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutogentMcp(key = "app_5srfoiyfoew1q0zfi4354sj", description = "User Profile Service for MCP POC")
public class UserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }
}
