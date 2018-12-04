package uk.ac.belfastmet.dwarfssaved.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.dwarfssaved.repository.DwarfRepository;

@Controller
@RequestMapping
public class SearchController {
	
	DwarfRepository dwarfRepository;
	
	public SearchController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}
	
	@GetMapping("/searchById")
	public String searchId(@RequestParam("category") String category, @RequestParam("val") String value, Model model) {
		        
        switch(category) {
        
        	case "id":
        		model.addAttribute("pageTitle", "Dwarf Found!");
    			model.addAttribute("dwarf", this.dwarfRepository.findByDwarfId(Integer.parseInt(value)));
    			return "dwarf";
    			
        	case "name":
        		model.addAttribute("pageTitle", "Dwarf Found!");
        		model.addAttribute("dwarf", this.dwarfRepository.findByName(value));
        			
        		return "dwarf";
        		
        	case "author":
        		model.addAttribute("pageTitle", "Dwarfs Found!");
        		model.addAttribute("dwarfs", this.dwarfRepository.findByAuthor(value));
        			
        		return "dwarfs";
        		
        	default:
        		return "index";
        }
	}
}
