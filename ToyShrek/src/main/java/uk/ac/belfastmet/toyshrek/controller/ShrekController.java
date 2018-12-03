package uk.ac.belfastmet.toyshrek.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.toyshrek.service.CharacterService;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import uk.ac.belfastmet.toyshrek.domain.Character;

@Controller
@RequestMapping
public class ShrekController {

	@GetMapping("/shrek")
	public String shrek(Model model) {
		
		CharacterService charService = new CharacterService();
		ArrayList<Character> characters = charService.getShrekCharacters();
		
		model.addAttribute("pageTitle", "Shrek");
		model.addAttribute("shreks", characters);
		
		return "shrek.html";
	}
}
