package ca.sheridancollege.bautisse.services;

import java.util.List;
import java.util.Optional;

import ca.sheridancollege.bautisse.models.Flight;

public interface FlightService {
	public List<Flight> getAllFlights();
	public Optional<Flight> getFlightById(Long id);
	public void addFlights(List<Flight> flights);
}
