package ca.sheridancollege.bautisse.models;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/*
 * Id, Origin, Destination, DepartDay, ArriveDay, Price). 
 */
@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Flight {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String origin;
	@NonNull
	private String destination;
	@NonNull
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	private LocalDate departDate;
	@NonNull
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	private LocalDate arriveDate;
	@NonNull
	private Double price;
	
}
