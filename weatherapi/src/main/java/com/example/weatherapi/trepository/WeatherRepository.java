package com.example.weatherapi.trepository;

import com.example.weatherapi.umodel.WeatherInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherRepository extends JpaRepository<WeatherInfo, String> {
}
