package uk.ac.belfastmet.weather.domain;

import lombok.Data;

@Data
public class Location {
	
	private String name;
	private Float latitude;
	private Float longitude;

}
