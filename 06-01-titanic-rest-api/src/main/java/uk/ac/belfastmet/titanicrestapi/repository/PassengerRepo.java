package uk.ac.belfastmet.titanicrestapi.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.titanicrestapi.domain.Passenger;

public interface PassengerRepo extends CrudRepository<Passenger, Integer> {

	Passenger findByPassengerId(Integer passengerId);


}
