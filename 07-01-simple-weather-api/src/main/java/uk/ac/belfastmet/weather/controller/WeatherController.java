package uk.ac.belfastmet.weather.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.weather.domain.TodaysWeather;

@Controller
public class WeatherController {
	
	
	@GetMapping("")
	public String home(Model model) {
		
		return "home";	
	}
	
	@GetMapping("/weather/{location}") 
		public String belfast(@PathVariable("location") String location, Model model) {
		
		String belfastWeatherUrl = "http://www.codingfury.net/training/weathersample/weather.php?location=" + location;
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(belfastWeatherUrl, TodaysWeather.class);
		
		Logger logger = LoggerFactory.getLogger(TodaysWeather.class);
		logger.info(todaysWeather.toString());
		
		model.addAttribute("todaysWeather", todaysWeather);
		
		return "weather";
	}

}
