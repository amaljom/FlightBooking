package it.alten.flightbooking.controller;

import it.alten.flightbooking.model.Booking;
import it.alten.flightbooking.model.dto.BookingDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/bookings")
public interface FlightBookingSystem {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    ResponseEntity<Booking> bookFlight(@RequestBody BookingDto bookingDto);

    @GetMapping("/all")
    ResponseEntity<List<Booking>> findAll();

    @GetMapping("/all/{passengerName}")
    ResponseEntity<List<Booking>> findAllByPassenger(@PathVariable(value="passengerName")String passengerName);

    @DeleteMapping("/delete/{id}")
    ResponseEntity<List<Booking>>  delete(@PathVariable(value = "id") Long id);

//    @GetMapping()
//    int getAvailableSeats(String flightNumber);
}
