package uk.ac.belfastmet.toyshrek.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.toyshrek.domain.Character;
import uk.ac.belfastmet.toyshrek.service.CharacterService;

@Controller
@RequestMapping
public class ToyStoryController {

	@GetMapping("/toystory")
	public String toystory(Model model) {
		CharacterService charService = new CharacterService();
		ArrayList<Character> characters = charService.getToyStoryCharacters();
		
		model.addAttribute("pageTitle", "Toy Story");
		model.addAttribute("toys", characters);
		
		return "toystory.html";
	}
}
