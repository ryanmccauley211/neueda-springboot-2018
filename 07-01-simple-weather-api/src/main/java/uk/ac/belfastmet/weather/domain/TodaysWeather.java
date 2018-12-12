package uk.ac.belfastmet.weather.domain;

import java.util.Map;

import lombok.Data;

@Data
public class TodaysWeather {
	
	private Location location;
	private Weather weather;
	
	public String toString() {
		
		String location = this.location.getName() + ", "
				+ this.location.getLatitude() + ", "
				+ this.location.getLongitude() + "\n";
		
		String weather = this.weather.toString();
		
		return location + weather;
	}

}
