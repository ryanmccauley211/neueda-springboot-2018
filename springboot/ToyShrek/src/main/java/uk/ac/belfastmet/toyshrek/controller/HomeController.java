package uk.ac.belfastmet.toyshrek.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping
public class HomeController {

	@GetMapping("")
	public String home(Model model) {
		return "index.html";
	}
}
