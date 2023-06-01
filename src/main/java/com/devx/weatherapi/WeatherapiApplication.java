package com.devx.weatherapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class WeatherapiApplication {


	private static final String template = "Current weather of %s is %s";
	
	public static void main(String[] args) {
		SpringApplication.run(WeatherapiApplication.class, args);
	}

	//Get fake weather
	@GetMapping(value="weather")
	public Weather getWeather(@RequestParam(value = "location", defaultValue = "kolkata") String location) {
		return new Weather(location, String.format(template, location, Helper.getRandomMinMax(0, 40)));
	}

	//Ping
	@GetMapping(value = "ping")
	public String ping(){
		return String.format("pong");
	}
}
