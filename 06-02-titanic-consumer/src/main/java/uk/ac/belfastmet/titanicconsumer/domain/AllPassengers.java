package uk.ac.belfastmet.titanicconsumer.domain;

import java.util.ArrayList;

public class AllPassengers {
	
	private ArrayList<Passenger> allPassengers;
	
	public AllPassengers() {super();}

	public AllPassengers(ArrayList<Passenger> allPassengers) {
		super();
		this.allPassengers = allPassengers;
	}

	public ArrayList<Passenger> getAllPassengers() {
		return allPassengers;
	}

	public void setAllPassengers(ArrayList<Passenger> allPassengers) {
		this.allPassengers = allPassengers;
	}
}
