package uk.ac.belfastmet.largestbuildings.domain;

public class BigFloorBuilding extends Building {

	private double floorArea;

	public BigFloorBuilding(String name, String country, String place, String description, String map, String img,
			double floorArea) {
		super(name, country, place, description, map, img);
		this.floorArea = floorArea;
	}

	public double getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(double floorArea) {
		this.floorArea = floorArea;
	}
}
