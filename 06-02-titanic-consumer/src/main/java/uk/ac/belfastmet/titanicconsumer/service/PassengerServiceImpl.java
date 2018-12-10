package uk.ac.belfastmet.titanicconsumer.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import uk.ac.belfastmet.titanicconsumer.domain.AllPassengers;
import uk.ac.belfastmet.titanicconsumer.domain.Passenger;

public class PassengerServiceImpl implements PassengerService {

	@Value("${api.titanic.url}")
	private String passengerUrl;
	private RestTemplate restTemplate;
	public PassengerServiceImpl(String passengerUrl, RestTemplate restTemplate) {
		super();
		this.passengerUrl = passengerUrl;
		this.restTemplate = restTemplate;
	}
	
	@Override
	public ArrayList<Passenger> list() {
		
		UriComponentsBuilder getAllPassengersUrl = UriComponentsBuilder.fromUriString("http://localhost:8090/passengers");
		
		AllPassengers allPassengers = this.restTemplate.getForObject(getAllPassengersUrl.toString(), 
				AllPassengers.class);
		
		return allPassengers.getAllPassengers();
	}
	
	@Override
	public Passenger get(Integer passengerId) {
		UriComponentsBuilder getPassengerUri = UriComponentsBuilder.fromUriString("http://localhost:8090/passengers/100");
		
		return this.restTemplate.getForObject(getPassengerUri.toString(), Passenger.class);
	}
	
	@Override
	public Passenger add(Passenger passenger) {
		return null;
	}
	
	@Override
	public Passenger update(Passenger passenger) {
		return null;
	}
	@Override
	public void delete(Integer passengerId) {
		
	}
	
}