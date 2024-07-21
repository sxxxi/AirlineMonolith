package ca.sheridancollege.bautisse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ca.sheridancollege.bautisse.models.Flight;
import ca.sheridancollege.bautisse.repositories.FlightRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FlightServiceImpl implements FlightService {
	private final FlightRepository flightRepo;

	public List<Flight> getAllFlights() {
		return flightRepo.findAll();
	}

	public Optional<Flight> getFlightById(Long id) {
		return flightRepo.findById(id);
	}


	public void addFlights(List<Flight> flights) {
		flights.forEach(flight -> {
			flightRepo.save(flight);
		});
	}
	
}
