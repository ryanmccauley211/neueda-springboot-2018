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
public class TolkienController {
	
	@GetMapping("/tolkien")
	public String tolkien(Model model) {
		
		DwarfService dwarfService = new DwarfService();
		ArrayList<Dwarf> dwarfs = dwarfService.getTolkienDwarfs();
				
		model.addAttribute("pageTitle", "Tolkien");
		model.addAttribute("tolkienDwarfs", dwarfs);
		
		return "tolkien.html";
	}

}
