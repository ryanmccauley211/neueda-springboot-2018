package uk.ac.belfastmet.dwarf.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarf.domain.Dwarf;
import uk.ac.belfastmet.dwarf.service.DwarfService;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;

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
