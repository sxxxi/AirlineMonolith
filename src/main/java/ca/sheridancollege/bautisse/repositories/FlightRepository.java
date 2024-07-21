package ca.sheridancollege.bautisse.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.bautisse.models.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
	public List<Flight> findAll();
	public Optional<Flight> findById(Long id);
//	public Flight save(Flight flight);ß
	

}
