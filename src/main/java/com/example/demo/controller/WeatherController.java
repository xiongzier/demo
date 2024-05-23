package com.example.demo.controller;

import com.example.demo.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/response")
    public String getResponse() {
        String weather = weatherService.getWeather();
        switch (weather) {
            case "Sunny":
                String sunnyMessage = "It's sunny, let's go for a picnic!";
                return sunnyMessage;
            case "Rainy":
                String rainyMessage = "It's rainy, better stay indoors.";
                return rainyMessage;
            default:
                String unknownMessage = "Weather condition not recognized.";
                return unknownMessage;
        }
    }
}
