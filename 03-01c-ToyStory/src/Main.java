import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Toy woody = new Toy("Woody", "Tom", "Hanks");
		Toy buzz = new Toy("Buzz", "Tim", "Allen");
		Toy slinky = new Toy("Slinky", "Jim", "Varney");
		Toy ham = new Toy("Ham", "John", "Ratzenberger");
		Toy rex = new Toy("Rex", "Wallace", "Shawn");
		Toy potato = new Toy("Mr Potato Head", "Don", "Rickles");
		
		ArrayList<Toy> toys = new ArrayList<Toy>() {{
			add(woody);		add(buzz);
			add(slinky);	add(ham);
			add(rex);		add(potato);
		}};
		
		System.out.println(" --------------------------------------------");
		System.out.println("|	CHARACTERS FROM TOY STORY            |");	
		System.out.println(" --------------------------------------------\n");

		for(Toy toy : toys) {
			System.out.printf("%s - voice by %s %s\n", toy.getToyName(), toy.getActorFirstName(), toy.getActorLastName());
		}
	}
}
