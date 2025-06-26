package com.autogentmcp.order;

import com.autogentmcp.registry.AutogentTool;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final Map<String, String> orderStatus = new HashMap<>();

    @AutogentTool(uri = "/orders/{orderId}/status", description = "Get order status by order ID")
    @GetMapping("/{orderId}/status")
    public String getOrderStatus(@PathVariable String orderId) {
        return orderStatus.getOrDefault(orderId, "Processing");
    }

    @AutogentTool(uri = "/orders/{orderId}/status", description = "Update order status")
    @PostMapping("/{orderId}/status")
    public String updateOrderStatus(@PathVariable String orderId, @RequestParam String status) {
        orderStatus.put(orderId, status);
        return "Order " + orderId + " status updated to " + status;
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
