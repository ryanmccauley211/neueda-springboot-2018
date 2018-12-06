package uk.ac.belfastmet.titanic.repository;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import uk.ac.belfastmet.titanic.domain.Passenger;

public interface TitanicRepository extends CrudRepository<Passenger, Integer> {
	
	Iterable<Passenger> findByPassengerIdOrderByNameAsc(Integer id);
	Iterable<Passenger> findByNameContainsOrderByNameAsc(String name);
	Iterable<Passenger> findBySexOrderByNameAsc(String sex);
	Iterable<Passenger> findByTicketContainsOrderByNameAsc(String ticket);
	Iterable<Passenger> findByAgeBetweenOrderByNameAsc(int min, int max);
}