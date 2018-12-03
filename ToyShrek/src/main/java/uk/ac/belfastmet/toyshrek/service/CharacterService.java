package uk.ac.belfastmet.toyshrek.service;

import java.util.ArrayList;

import uk.ac.belfastmet.toyshrek.domain.Character;

public class CharacterService {

	public ArrayList<Character> getToyStoryCharacters() {

		Character woody = new Character("Woody", "Toy Story", "woody.png");
		Character buzz = new Character("Buzz", "Toy Story", "buzz.png");
		Character sid = new Character("Sid", "Toy Story", "sid.png");
		Character rex = new Character("Rex", "Toy Story", "rex.png");
		Character slinky = new Character("Slinky", "Toy Story", "slinky.png");
		Character hamm = new Character("Hamm", "Toy Story", "hamm.png");
		Character alien = new Character("Alien", "Toy Story", "alien.png");
		Character rocky = new Character("Rocky", "Toy Story", "rocky.png");

		ArrayList<Character> characters = new ArrayList<Character>() {
			{
				add(woody);
				add(buzz);
				add(sid);
				add(rex);
				add(slinky);
				add(hamm);
				add(alien);
				add(rocky);
			}
		};

		return characters;
	}

	public ArrayList<Character> getShrekCharacters() {

		Character shrek = new Character("Shrek", "Shrek", "shrek.png");
		Character donkey = new Character("Donkey", "Shrek", "donkey.png");
		Character fiona = new Character("Fiona", "Shrek", "fiona.png");
		Character puss = new Character("Puss", "Shrek", "puss.png");
		Character dragon = new Character("Dragon", "Shrek", "dragon.png");
		Character arthur = new Character("Arthur", "Shrek", "arthur.png");
		Character wolf = new Character("Wolf", "Shrek", "wolf.png");
		Character gingerbread = new Character("Gingerbread Man", "Shrek", "gingerbread.png");

		ArrayList<Character> characters = new ArrayList<Character>() {
			{
				add(shrek);
				add(donkey);
				add(fiona);
				add(puss);
				add(dragon);
				add(arthur);
				add(wolf);
				add(gingerbread);
			}
		};

		return characters;
	}
}
