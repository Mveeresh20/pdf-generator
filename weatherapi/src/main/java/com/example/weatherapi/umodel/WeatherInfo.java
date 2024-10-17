package com.example.weatherapi.umodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class WeatherInfo {

    @Id
    private String pincode;  
    private double latitude;
    private double longitude;
    private String weatherDescription;
    private String forDate; // Add this field

    // No-arg constructor (required by JPA)
    public WeatherInfo() {}

    // Getters and Setters
    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    public String getForDate() { // Add this getter
        return forDate;
    }

    public void setForDate(String forDate) { // Add this setter
        this.forDate = forDate;
    }
}
