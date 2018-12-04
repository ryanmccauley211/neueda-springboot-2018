package uk.ac.belfastmet.titanic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.titanic.repository.TitanicRepository;


@Controller
@RequestMapping
public class PassengerController {
	
	private TitanicRepository titanicRepository;
	
	public PassengerController(TitanicRepository titanicRepository) {
		super();
		this.titanicRepository = titanicRepository;
	}

	@GetMapping("/passengers")
	public String home(Model model) {
		
		model.addAttribute("passengers", titanicRepository.findAll());
		return "passengers";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("category") String category, @RequestParam("val") String val, Model model) {
		
		
		System.out.println(val);
		
		switch (category) {
		
		case "name": 
			model.addAttribute("passengers", titanicRepository.findByName(val));
			break;
		
		case "sex": 
			model.addAttribute("passengers", titanicRepository.findBySex(val));
			break;

		}
		
		return "passengers";
	}
}
