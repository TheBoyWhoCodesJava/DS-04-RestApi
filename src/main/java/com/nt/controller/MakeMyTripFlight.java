package com.nt.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flight")
public class MakeMyTripFlight {

	@GetMapping("/bookinfo/{name}/{amt}")
	public ResponseEntity<String> getBookingInfo(@PathVariable("name") String name, @PathVariable("amt") Integer amt) {

		Map<String, Object> map = Map.of("Name: ", name, "Amount: ", amt);

		return new ResponseEntity<String>("Booking Success!!, Please colect youur below ticket booked.\n" + map,
				HttpStatus.OK);
	}

	@PostMapping("/bookFlight")
	
	public ResponseEntity<String> bookFlight()  {

		return new ResponseEntity<String>("Booking Success!!,",HttpStatus.CREATED);
	}

	@PutMapping("/updateFlight")
	public ResponseEntity<String> updateFlight()  {
		
		return new ResponseEntity<String>("Flight Update Success!!,",HttpStatus.OK);
	}

	@PatchMapping("/updateClass")
	public ResponseEntity<String> updateTravelClass() {

		return new ResponseEntity<String>("Travel class update Success!!,",HttpStatus.OK);
	}

	@DeleteMapping("/cancelTicket")
	public ResponseEntity<String> cancelBookedTicket()  {

		return new ResponseEntity<String>("Booking Cancel Success!!,",HttpStatus.OK);
	}

}
