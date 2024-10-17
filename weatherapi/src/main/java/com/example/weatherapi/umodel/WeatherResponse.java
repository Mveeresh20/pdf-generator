package com.example.weatherapi.umodel;


	
	

	import java.util.HashMap;
	import java.util.Map;

	public class WeatherResponse {
	    private String status;
	    private Map<String, Object> data;

	    public WeatherResponse(String status) {
	        this.status = status;
	        this.data = new HashMap<>();
	    }

	    public String getStatus() {
	        return status;
	    }

	    public Map<String, Object> getData() {
	        return data;
	    }

	    public void setData(String pincode, double latitude, double longitude, String weatherDescription, String forDate) {
	        Map<String, Object> weatherData = new HashMap<>();
	        weatherData.put("pincode", pincode);
	        weatherData.put("latitude", latitude);
	        weatherData.put("longitude", longitude);
	        
	        Map<String, String> details = new HashMap<>();
	        details.put("temperature", "28°C"); // Example value
	        details.put("humidity", "65%"); // Example value
	        details.put("description", weatherDescription);
	        details.put("windSpeed", "5 km/h"); // Example value

	        weatherData.put("weatherData", details);
	        weatherData.put("forDate", forDate);
	        
	        data.put("weatherInfo", weatherData);
	    }
	}



