package uk.ac.belfastmet.largestbuildings.domain;

public class BigVolBuilding extends Building {
	
	private double floorArea;
	private double volume;

	public BigVolBuilding(String name, String country, String place, String description, String map, String img,
			double floorArea, double volume) {
		super(name, country, place, description, map, img);
		this.floorArea = floorArea;
		this.volume = volume;
	}


	public double getFloorArea() {
		return floorArea;
	}


	public void setFloorArea(double floorArea) {
		this.floorArea = floorArea;
	}


	public double getVolume() {
		return volume;
	}


	public void setVolume(double volume) {
		this.volume = volume;
	}
}
