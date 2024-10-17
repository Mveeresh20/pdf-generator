package com.example.weatherapi.controller;

import com.example.weatherapi.umodel.WeatherInfo;
import com.example.weatherapi.umodel.WeatherResponse;
import com.example.weatherapi.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @PostMapping("/add")
    public void addWeatherInfo(@RequestBody WeatherInfo weatherInfo) {
        weatherService.saveWeatherInfo(weatherInfo);
    }

    @GetMapping("/{pincode}")
    public WeatherResponse getWeatherInfo(@PathVariable String pincode) {
        WeatherInfo weatherInfo = weatherService.getWeatherInfo(pincode);
        WeatherResponse response = new WeatherResponse("success");
        
        if (weatherInfo != null) {
            response.setData(
                weatherInfo.getPincode(),
                weatherInfo.getLatitude(),
                weatherInfo.getLongitude(),
                weatherInfo.getWeatherDescription(),
                weatherInfo.getForDate() // Make sure this is set when adding weather info
            );
        }
        
        
        return response;
    }
}
