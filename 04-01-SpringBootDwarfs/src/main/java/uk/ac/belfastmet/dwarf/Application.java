package uk.ac.belfastmet.dwarf;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uk.ac.belfastmet.dwarf.domain.Dwarf;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@PostConstruct
	public void createDwarfs() {
		
		Dwarf sleepy = 	new Dwarf("Sleepy", "Disney", "Sleepy.png");
		Dwarf happy = 	new Dwarf("Happy", "Disney", "Happy.png");
		Dwarf bashful = new Dwarf("Bashful", "Disney", "Bashful.png");
		Dwarf doc = 	new Dwarf("Doc", "Disney", "Doc.png");
		Dwarf grumpy =	new Dwarf("Grumpy", "Disney", "Grumpy.png");
		Dwarf sneezy = 	new Dwarf("Sneezy", "Disney", "Sneezy.png");
		Dwarf dopey = 	new Dwarf("Dopey", "Disney", "Dopey.png");
		
		Dwarf dwalin = 	new Dwarf("Dwalin", "Tolken", "Dwalin.png");
		Dwarf balin = 	new Dwarf("Balin", "Tolken", "Balin.png");
		Dwarf ori = 	new Dwarf("Ori", "Tolken", "Ori.png");
		Dwarf dori = 	new Dwarf("Dori", "Tolken", "Dori.png");
		Dwarf nori =	new Dwarf("Nori", "Tolken", "Nori.png");
		Dwarf bifur = 	new Dwarf("Bifur", "Tolken", "Bifur.png");
		Dwarf bofur = 	new Dwarf("Bofur", "Tolken", "Bofur.png");
		Dwarf kili = 	new Dwarf("Kili", "Tolken", "Kili.png");
		Dwarf fili = 	new Dwarf("Fili", "Tolken", "Fili.png");
		Dwarf oin = 	new Dwarf("Oin", "Tolken", "Oin.png");
		Dwarf gloin = 	new Dwarf("Gloin", "Tolken", "Gloin.png");
		Dwarf bombur = 	new Dwarf("Bombur", "Tolken", "Bombur.png");
		Dwarf thorin = 	new Dwarf("Thorin", "Tolken", "Thorin.png");
		
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>() {{
			add(sleepy);		add(happy);
			add(bashful);		add(doc);
			add(grumpy);		add(sneezy);
			add(dopey);
			
			add(dwalin);		add(balin);
			add(ori);			add(dori);
			add(nori);			add(bofur);
			add(bifur);			add(fili);
			add(kili);			add(oin);
			add(gloin);			add(bombur);
			add(thorin);	
		}};
	}
}
