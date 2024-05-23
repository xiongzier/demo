package com.example.demo.service.impl;

import com.example.demo.service.WeatherService;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements WeatherService {
    @Override
    public String getWeather() {
        // 模拟调用气象局接口，这里返回一个固定的值
        return "Sunny";
    }
}
