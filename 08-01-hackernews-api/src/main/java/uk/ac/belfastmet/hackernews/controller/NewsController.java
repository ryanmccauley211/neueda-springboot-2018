package uk.ac.belfastmet.hackernews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.hackernews.domain.Article;

@Controller
public class NewsController {
	
	@GetMapping("news/{id}")
	public String getNews(@PathVariable("id") Integer id ,Model model) {
		
		String targetUrl = "https://hacker-news.firebaseio.com/v0/item/" + id + ".json";
		
		RestTemplate restTemplate = new RestTemplate();
		Article article = restTemplate.getForObject(targetUrl, Article.class);
		
		model.addAttribute("article", article);
		
		return "news";
	}
}
