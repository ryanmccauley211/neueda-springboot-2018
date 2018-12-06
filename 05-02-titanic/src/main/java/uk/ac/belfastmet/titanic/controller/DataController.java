package uk.ac.belfastmet.titanic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.titanic.domain.Passenger;
import uk.ac.belfastmet.titanic.repository.TitanicRepository;

@Controller
@RequestMapping
public class DataController {
	
	private TitanicRepository titanicRepository;
	
	public DataController(TitanicRepository titanicRepository) {
		super();
		this.titanicRepository = titanicRepository;
	}
	
	@GetMapping("/edit/{passengerId}")
	public String edit(@PathVariable("passengerId") Integer passengerId, Model model) {
				
		model.addAttribute("passenger", titanicRepository.findById(passengerId));

		return "edit";
	}
	
	@GetMapping("/add")
	public String add(Model model) {
		
		model.addAttribute("pageTitle", "add");
		model.addAttribute("passenger", new Passenger());

		return "edit";
	}
	
	@PostMapping("/save")
	public String save(Passenger passenger, BindingResult bindingResult, Model model) {
		
		if (bindingResult.hasErrors()) {
			return "edit";
		}
		
		Passenger savePassenger = titanicRepository.save(passenger);
		return "redirect:/passengers";
	}
	
	@GetMapping("/delete/{passengerId}")
	public String delete(Model model, @PathVariable("passengerId") Integer passengerId, 
			RedirectAttributes redirectAttributes) {
				
		
		redirectAttributes.addFlashAttribute("message", "Successfully deleted passenger");
		titanicRepository.deleteById(passengerId);
		return "redirect:/passengers";
	}
}
