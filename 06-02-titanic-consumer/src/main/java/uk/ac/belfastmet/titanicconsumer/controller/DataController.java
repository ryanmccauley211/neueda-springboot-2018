package uk.ac.belfastmet.titanicconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.titanicconsumer.domain.Passenger;
import uk.ac.belfastmet.titanicconsumer.service.PassengerService;

@Controller
@RequestMapping
public class DataController {
	
	
	@Autowired
	PassengerService passengerService;
	
	public DataController() {super();}
	
	public DataController(PassengerService passengerService) {
		super();
		this.passengerService = passengerService;
	}
	
	@GetMapping("/edit/{passengerId}")
	public String edit(@PathVariable("passengerId") Integer passengerId, Model model) {
				
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
		
		return "redirect:/passengers";
	}
	
	@GetMapping("/delete/{passengerId}")
	public String delete(Model model, @PathVariable("passengerId") Integer passengerId, 
			RedirectAttributes redirectAttributes) {
				
		
		redirectAttributes.addFlashAttribute("message", "Successfully deleted passenger");

		return "redirect:/passengers";
	}
}
