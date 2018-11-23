package uk.ac.belfastmet.largestbuildings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.largestbuildings.service.AreaBuildingService;

@Controller
@RequestMapping
public class BigFloorController {

	@GetMapping("/floor")
	public String floor(Model model) {
		
		AreaBuildingService areaService = new AreaBuildingService();
		model.addAttribute("byFloor", areaService.getByFloor());
		return "floor.html";
	}
	
}
