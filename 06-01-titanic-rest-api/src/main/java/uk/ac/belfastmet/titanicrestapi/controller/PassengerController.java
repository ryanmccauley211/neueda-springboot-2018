package uk.ac.belfastmet.titanicrestapi.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.titanicrestapi.domain.Passenger;
import uk.ac.belfastmet.titanicrestapi.repository.PassengerRepo;

@RestController
public class PassengerController {
	
	@Autowired
	private PassengerRepo passengerRepo;
	
	public PassengerController(PassengerRepo passengerRepo) {
		super();
		this.passengerRepo = passengerRepo;
	}

	@GetMapping("passengers")
	public Map<String, Object> getAllPassengers() {
		
		Map<String, Object> passengersMap = new HashMap<String, Object>();
		passengersMap.put("allPassengers", passengerRepo.findAll());
						
		return passengersMap;
	}
	
	@GetMapping("passengers/{passengerId}")
	public Passenger getAllPassengers(@PathVariable("passengerId") Integer passengerId) {
		
		return this.passengerRepo.findByPassengerId(passengerId);
	}
	
	@PostMapping("passengers")
	public String postAllPassengers() {
		
		return "Posting a message to passengers";
	}
	
	@PutMapping("passengers/{passengerId}")
	public String updatePassenger(@PathVariable("passengerId") Integer passengerId,
			@RequestBody Passenger passenger) {
				
		if (this.passengerRepo.existsById(passengerId)) {
			this.passengerRepo.save(passenger);
			return "{Update: Success, Passenger: " + passengerId + "}";
		}
		else {
			return "{Update: Failure - passenger does not exist, Passenger: " + passengerId + "}";
		}	
	}
	
	@PostMapping("passengers/add")
	public Passenger addPassenger(@RequestBody Passenger passenger) {

		return this.passengerRepo.save(passenger);
	}
	
	@DeleteMapping("passengers/{passengerId}")
	public String deletePassenger(@PathVariable("passengerId") Integer passengerId) {
		
		if (this.passengerRepo.existsById(passengerId)) {
			this.passengerRepo.deleteById(passengerId);
			return "{Delete: Success, Passenger: " + passengerId + "}";
		}
		else {
			return "{Delete: Failure - passenger does not exist, Passenger: " + passengerId + "}";
		}
	}
}
