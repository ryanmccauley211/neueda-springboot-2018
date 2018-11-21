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
