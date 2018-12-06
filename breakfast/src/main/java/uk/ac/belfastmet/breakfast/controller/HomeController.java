package uk.ac.belfastmet.breakfast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {
	
	public String home(Model model) {
		
		return "home";
	}
	
}
