package uk.ac.belfastmet.largestbuildings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.largestbuildings.service.VolBuildingService;

@Controller
@RequestMapping
public class BigVolController {
	
	@GetMapping("volume")
	public String volume(Model model) {
		
		
		VolBuildingService volService = new VolBuildingService();		
		model.addAttribute("byVolume", volService.getByVolume());
		
		return "volume.html";
	}
	
}
