package uk.ac.belfastmet.dwarfssaved.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarfssaved.domain.Dwarf;
import uk.ac.belfastmet.dwarfssaved.service.DwarfService;

@Controller
@RequestMapping
public class DisneyController {
	
	@GetMapping("/disney")
	public String disney(Model model) {
		
		DwarfService dwarfService = new DwarfService();
		ArrayList<Dwarf> dwarfs = dwarfService.getDisneyDwarfs();
				
		model.addAttribute("pageTitle", "Disney");
		model.addAttribute("disneyDwarfs", dwarfs);
		return "disney.html";
	}

}
