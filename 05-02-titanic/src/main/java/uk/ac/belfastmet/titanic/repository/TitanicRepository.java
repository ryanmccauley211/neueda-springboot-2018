package uk.ac.belfastmet.titanic.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.titanic.domain.Passenger;

public interface TitanicRepository extends CrudRepository<Passenger, Integer> {

	Iterable<Passenger> findByName(String name);
	Iterable<Passenger> findBySex(String sex);

}
