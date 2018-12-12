package uk.ac.belfastmet.weather.domain;

import lombok.Data;

@Data
public class Weather {
	
	private String description;
	private String cloudcover;
	private Wind wind;
	private String image;

}
