package uk.ac.belfastmet.sbcontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Playground {
	
	@GetMapping("/")
	public String greeting(Model model) {
		return "<h1>Hello World!</h1>";
	}
	
	@GetMapping("/bingo")
	public String bingo(Model model) {
		return "There was a dog in our yard";
	}
	
	@GetMapping("/belfastmet")
	public String belfastmet(Model model) {
		return "Leading the city to work";
	}
}