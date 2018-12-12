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
		public String weather(@PathVariable("location") String location, Model model) {
		
		String weatherUrl = "http://www.codingfury.net/training/weathersample/weather.php?location=" + location;
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(weatherUrl, TodaysWeather.class);
		
		Logger logger = LoggerFactory.getLogger(TodaysWeather.class);
		logger.info(todaysWeather.toString());
		
		model.addAttribute("todaysWeather", todaysWeather);
		
		return "weather";
	}
	
	@GetMapping("/compare") 
		public String compare(Model model) {
		
		String belWeatherUrl = "http://www.codingfury.net/training/weathersample/weather.php?location=belfast";
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather belfastWeather = restTemplate.getForObject(belWeatherUrl, TodaysWeather.class);
		
		String dubWeatherUrl = "http://www.codingfury.net/training/weathersample/weather.php?location=dublin";
		RestTemplate dubWestTemplate = new RestTemplate();
		TodaysWeather dublintWeather = restTemplate.getForObject(dubWeatherUrl, TodaysWeather.class);
		
		String lonWeatherUrl = "http://www.codingfury.net/training/weathersample/weather.php?location=london";
		RestTemplate lonWestTemplate = new RestTemplate();
		TodaysWeather londontWeather = restTemplate.getForObject(lonWeatherUrl, TodaysWeather.class);

		
		model.addAttribute("belfast", belfastWeather);
		model.addAttribute("dublin", dublintWeather);
		model.addAttribute("london", londontWeather);

		return "compare";
	}

}
