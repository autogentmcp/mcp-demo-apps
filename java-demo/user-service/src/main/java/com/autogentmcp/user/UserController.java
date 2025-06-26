package com.autogentmcp.user;

import com.autogentmcp.registry.AutogentTool;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final Map<Integer, User> users = new HashMap<>();

    @AutogentTool(uri = "/users", description = "Create a new user")
    @PostMapping
    public User createUser(@RequestParam int id, @RequestParam String name, @RequestParam String email, @RequestParam int age) {
        User user = new User(id, name, email, age);
        users.put(id, user);
        return user;
    }

    @AutogentTool(uri = "/users/{id}", description = "Get user by ID")
    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        if (users.containsKey(id)) {
            return users.get(id);
        } else {
            // Return a dummy user if not found
            return new User(id, "Dummy User", "dummy@example.com", 30);
        }
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
