package uk.ac.belfastmet.dwarf.domain;

public class Dwarf {
	private String name;
	private String author;
	private String img;
	
	public Dwarf() {}

	public Dwarf(String name, String author, String img) {
		this.name = name;
		this.author = author;
		this.img = img;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
}
