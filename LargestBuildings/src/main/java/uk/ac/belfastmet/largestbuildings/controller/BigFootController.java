package uk.ac.belfastmet.largestbuildings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.largestbuildings.service.FootBuildingService;

@Controller
@RequestMapping
public class BigFootController {

	@GetMapping("/footprint")
	public String floor(Model model) {
		
		FootBuildingService footService = new FootBuildingService();
		model.addAttribute("byFoot", footService.getByFoot());
		
		return "footprint.html";
	}
	
}
