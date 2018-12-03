import java.util.ArrayList;

public class DwarfsAndDwarves {

	public static void main(String[] args) {
		ArrayList<String> dwarfs = new ArrayList<String>() {{
			add("Bashful");		add("Doc");
			add("Grumpy");		add("Happy");
			add("Sneezy");		add("Sleepy");
			add("Dopey");
		}};
		
		ArrayList<String> dwarves = new ArrayList<String>() {{
			add("Dwalin");		add("Balin");
			add("Ori");			add("Dori");
			add("Nori");		add("Bifur");
			add("Bofur");		add("Kili");
			add("Fili");		add("Oin");
			add("Gloin");		add("Bombur");
			add("Thorin");
		}};
		
		System.out.println("The Seven Dwarfs");
		for(int i = 0; i < dwarfs.size(); i++) {
			System.out.printf("\t%s\n", dwarfs.get(i));
		}
		
		System.out.println("\n----------------------------------------------");
		System.out.println("\nThorin's Company");
		
		for(String dwarve : dwarves) {
			System.out.printf("\t%s\n", dwarve);
		}
	}
}
