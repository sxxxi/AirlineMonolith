package ca.sheridancollege.bautisse.bootstrap;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.bautisse.models.Flight;
import ca.sheridancollege.bautisse.services.FlightService;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class FlightBootstrap implements CommandLineRunner {
	private final FlightService flightService;

	@Override
	public void run(String... args) throws Exception {
		//Let's make 3 filght entries.
		List<Flight> flights = new ArrayList();
		
		
		flights.add(new Flight("TORONTO", "NARITA", LocalDate.now(), LocalDate.now(), 1000.00));
		flights.add(new Flight("TORONTO", "LA", LocalDate.now(), LocalDate.now(), 800.00));
		flights.add(new Flight("TORONTO", "NY", LocalDate.now(), LocalDate.now(), 500.00));
		
		
		
		flightService.addFlights(flights);
	}
	
	
	
}
