package uk.ac.belfastmet.toyshrek.domain;

public class Character {
	private String name;
	private String movie;
	private String img;
	
	public Character(String name, String movie, String img) {
		this.name = name;
		this.movie = movie;
		this.img = img;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
}
