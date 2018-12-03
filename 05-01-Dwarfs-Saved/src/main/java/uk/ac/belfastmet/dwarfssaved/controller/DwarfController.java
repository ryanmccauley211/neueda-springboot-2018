package uk.ac.belfastmet.dwarfssaved.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarfssaved.domain.Dwarf;
import uk.ac.belfastmet.dwarfssaved.repository.DwarfRepository;
import uk.ac.belfastmet.dwarfssaved.service.DwarfService;

@Controller
@RequestMapping
public class DwarfController {
	
	DwarfRepository dwarfRepository;
	
	public DwarfController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}


	@GetMapping("/disney")
	public String disney(Model model) {

		model.addAttribute("pageTitle", "Disney");
		model.addAttribute("disneyDwarfs", this.dwarfRepository.findByAuthor("disney"));
		return "disney.html";
	}
	
	@GetMapping("/tolkien")
	public String tolkien(Model model) {
		
		model.addAttribute("pageTitle", "Tolkien");
		model.addAttribute("tolkienDwarfs", this.dwarfRepository.findByAuthor("tolkien"));
		
		return "tolkien.html";
	}
}
