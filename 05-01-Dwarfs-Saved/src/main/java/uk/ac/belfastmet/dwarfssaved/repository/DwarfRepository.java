package uk.ac.belfastmet.dwarfssaved.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.dwarfssaved.domain.Dwarf;

public interface DwarfRepository extends CrudRepository<Dwarf, Integer> {
	
	Dwarf findByDwarfId(Integer dwarfId);

	Dwarf findByName(String dwarfName);

	Iterable<Dwarf> findByAuthor(String dwarfAuthor);
}
