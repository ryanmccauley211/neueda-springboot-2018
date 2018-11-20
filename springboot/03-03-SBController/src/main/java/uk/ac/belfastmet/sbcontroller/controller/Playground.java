package uk.ac.belfastmet.sbcontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Playground {
	
	public String greeting(Model model) {
		return "Hello World!";
	}
}