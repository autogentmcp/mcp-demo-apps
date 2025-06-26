package com.autogentmcp.weather;

import com.autogentmcp.registry.AutogentTool;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    private static final Map<String, String> MOCK_WEATHER = Map.of(
        "london", "Cloudy, 18C",
        "newyork", "Sunny, 25C",
        "paris", "Rainy, 16C"
    );

    @AutogentTool(uri = "/weather/{city}", description = "Get current weather by city")
    @GetMapping("/{city}")
    public String getWeather(@PathVariable String city) {
        return MOCK_WEATHER.getOrDefault(city.toLowerCase(), "Unknown");
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
