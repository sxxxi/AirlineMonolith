package ca.sheridancollege.bautisse.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.bautisse.models.Flight;
import ca.sheridancollege.bautisse.services.FlightService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/flights")
@AllArgsConstructor
public class FlightController {
	private final FlightService flightService;

	@GetMapping("")
	public ResponseEntity<List<Flight>> getAllFlights() {
		return ResponseEntity.ok(flightService.getAllFlights());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Flight> getFlightById(@RequestParam Long id) {
		return ResponseEntity.of(flightService.getFlightById(id));
	}
	
	@PostMapping("")
	public ResponseEntity<?> postFlight(@RequestBody Flight flight) {
		flightService.addFlights(List.of(flight));
		return ResponseEntity.ok(null);
	}
	
}
