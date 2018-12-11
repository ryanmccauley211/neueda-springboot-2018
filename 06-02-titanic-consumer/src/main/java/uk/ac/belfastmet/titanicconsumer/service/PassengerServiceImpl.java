package uk.ac.belfastmet.titanicconsumer.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import uk.ac.belfastmet.titanicconsumer.domain.AllPassengers;
import uk.ac.belfastmet.titanicconsumer.domain.Passenger;

@Service
public class PassengerServiceImpl implements PassengerService {

	@Value("${api.titanic.url}")
	private String apiUrl;
	private RestTemplate restTemplate;
	
	public PassengerServiceImpl(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}
	
	@Override
	public ArrayList<Passenger> list() {
				
		String listPassengerUrl = apiUrl + "/passengers";
		
		AllPassengers allPassengers = this.restTemplate.getForObject(listPassengerUrl, 
				AllPassengers.class);
		
		return allPassengers.getAllPassengers();
	}
	
	@Override
	public Passenger get(Integer passengerId) {
		String getPassengerUri = apiUrl + "/passengers/" + passengerId;
		
		return this.restTemplate.getForObject(getPassengerUri, Passenger.class);
	}
	
	@Override
	public Passenger add(Passenger passenger) {
		
		String addPassengerUrl = apiUrl + "/passengers/" + passenger.getPassengerId();

		this.restTemplate.postForObject(addPassengerUrl, passenger, Passenger.class);
		return passenger;
	}
	
	@Override
	public Passenger update(Passenger passenger) {
		
		String updatePassengerUrl = apiUrl + "/passengers/" + passenger.getPassengerId();

		this.restTemplate.put(updatePassengerUrl, passenger, Passenger.class);
		return passenger;
	}
	@Override
	public void delete(Integer passengerId) {
		String deletePassengerUrl = apiUrl + "/passengers/" + passengerId;

		this.restTemplate.delete(deletePassengerUrl);
	}
	
}