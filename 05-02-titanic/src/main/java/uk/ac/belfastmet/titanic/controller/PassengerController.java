package uk.ac.belfastmet.titanic.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String search(@RequestParam("category") String category, @RequestParam("val") String val, @RequestParam("radioValue") String radioValue, Model model) {
				
		System.out.println(radioValue);
		
		
		switch (category) {
		
			case "name": 
				model.addAttribute("passengers", titanicRepository.findByNameContainsOrderByNameAsc(val));
				break;
			
			case "sex": 
				model.addAttribute("passengers", titanicRepository.findBySexOrderByNameAsc(val));
				break;
				
			case "ticket": 
				model.addAttribute("passengers", titanicRepository.findByTicketContainsOrderByNameAsc(val));
				break;
	
			default:
				model.addAttribute("passengers", titanicRepository.findAll());
				break;
		}

		return "passengers";
	}
	
	@GetMapping("/view/{passengerId}/{name}")
	public String view(Model model, @PathVariable("passengerId") Integer passengerId, @PathVariable("name") String name) {
		
		System.out.println(name);
		
		model.addAttribute("passengers", titanicRepository.findByPassengerIdOrderByNameAsc(passengerId));
		return "view";
	}
	
	@GetMapping("/delete/{passengerId}")
	public String delete(Model model, @PathVariable("passengerId") Integer passengerId, 
			RedirectAttributes redirectAttributes) {
				
		
		redirectAttributes.addFlashAttribute("message", "Successfully deleted passenger");
		titanicRepository.deleteById(passengerId);
		return "redirect:/passengers";
	}
	
}
