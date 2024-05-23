package com.example.demo;

import com.example.demo.controller.WeatherController;
import com.example.demo.service.WeatherService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(WeatherController.class)
public class WeatherControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private WeatherService weatherService;

    @Test
    public void sunnyWeatherResponseTest() throws Exception {
        Mockito.when(weatherService.getWeather()).thenReturn("Sunny");

        mockMvc.perform(get("/response"))
                .andExpect(status().isOk())
                .andExpect(content().string("It's sunny, let's go for a picnic!"));
    }

    @Test
    public void rainyWeatherResponseTest() throws Exception {
        Mockito.when(weatherService.getWeather()).thenReturn("Rainy");

        mockMvc.perform(get("/response"))
                .andExpect(status().isOk())
                .andExpect(content().string("It's rainy, better stay indoors."));
    }

    @Test
    public void unknownWeatherResponseTest() throws Exception {
        Mockito.when(weatherService.getWeather()).thenReturn("Unknown");

        mockMvc.perform(get("/response"))
                .andExpect(status().isOk())
                .andExpect(content().string("Weather condition not recognized."));
    }
}
