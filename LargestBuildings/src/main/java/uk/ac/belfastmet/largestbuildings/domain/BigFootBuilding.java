package uk.ac.belfastmet.largestbuildings.domain;

public class BigFootBuilding extends Building {

	private double footPrint;
	private double width;
	private double length;
	

	public BigFootBuilding(String name, String country, String place, String description, String map, String img,
			double footPrint, double width, double length) {
		super(name, country, place, description, map, img);
		this.footPrint = footPrint;
		this.width = width;
		this.length = length;
	}

	public double getFootPrint() {
		return footPrint;
	}

	public void setFootPrint(double footPrint) {
		this.footPrint = footPrint;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
}
