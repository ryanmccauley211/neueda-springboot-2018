package uk.ac.belfastmet.largestbuildings.domain;

public class Building {
	
	private String name;
	private String country;
	private String place;
	private String description;
	private String map;
	private String img;
	
	public Building(String name, String country, String place, String description, String map, String img) {
		super();
		this.name = name;
		this.country = country;
		this.place = place;
		this.description = description;
		this.map = map;
		this.img = img;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMap() {
		return map;
	}

	public void setMap(String map) {
		this.map = map;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	
	
}
