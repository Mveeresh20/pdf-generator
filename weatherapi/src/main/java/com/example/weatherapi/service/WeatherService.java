package com.example.weatherapi.service;

import com.example.weatherapi.umodel.WeatherInfo;
import com.example.weatherapi.trepository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    private WeatherRepository weatherRepository;

    public WeatherInfo saveWeatherInfo(WeatherInfo weatherInfo) {
        return weatherRepository.save(weatherInfo);
    }

    public WeatherInfo getWeatherInfo(String pincode) {
        return weatherRepository.findById(pincode).orElse(null);
    }
}
