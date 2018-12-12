package uk.ac.belfastmet.belevents.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.belevents.domain.AllEvents;
import uk.ac.belfastmet.belevents.domain.BelEvent;


@Controller
public class BelEventController {
	
	@GetMapping("")
	public String home() {
		
		return "home";
	}
	
	@GetMapping("events")
	public String events(Model model) {
		
		String eventsUrl = "https://neueda-flask-bndouglas.c9users.io/belfast-events/api/";
		RestTemplate restTemplate = new RestTemplate();
		
		AllEvents allEvents = restTemplate.getForObject(eventsUrl, AllEvents.class);
		allEvents.sort();
		
		model.addAttribute("events", allEvents.getAllEvents());
		
		return "events";
	}

}
