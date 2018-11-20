import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Dwarf sleepy = 	new Dwarf("Sleepy", "Disney", "sleepy.png");
		Dwarf happy = 	new Dwarf("Happy", "Disney", "happy.png");
		Dwarf bashful = new Dwarf("Bashful", "Disney", "bashful.png");
		Dwarf doc = 	new Dwarf("Doc", "Disney", "doc.png");
		Dwarf grumpy =	new Dwarf("Grumpy", "Disney", "grumpy.png");
		Dwarf sneezy = 	new Dwarf("Sneezy", "Disney", "sneezy.png");
		Dwarf dopey = 	new Dwarf("Dopey", "Disney", "dopey.png");
		
		Dwarf dwalin = 	new Dwarf("Dwalin", "Tolken", "dwalin.png");
		Dwarf balin = 	new Dwarf("Balin", "Tolken", "balin.png");
		Dwarf ori = 	new Dwarf("Ori", "Tolken", "ori.png");
		Dwarf dori = 	new Dwarf("Dori", "Tolken", "dori.png");
		Dwarf nori =	new Dwarf("Nori", "Tolken", "nori.png");
		Dwarf bifur = 	new Dwarf("Bifur", "Tolken", "bifur.png");
		Dwarf bofur = 	new Dwarf("Bofur", "Tolken", "bofur.png");
		Dwarf kili = 	new Dwarf("Kili", "Tolken", "kili.png");
		Dwarf fili = 	new Dwarf("Fili", "Tolken", "fili.png");
		Dwarf oin = 	new Dwarf("Oin", "Tolken", "oin.png");
		Dwarf gloin = 	new Dwarf("Gloin", "Tolken", "gloin.png");
		Dwarf bombur = 	new Dwarf("Bombur", "Tolken", "bombur.png");
		Dwarf thorin = 	new Dwarf("Thorin", "Tolken", "thorin.png");
		
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
		
		System.out.println("The Dwarfs");
		for(Dwarf dwarf : dwarfs) {
			System.out.printf("\t%s\n", dwarf.getName());
		}
	}
}
