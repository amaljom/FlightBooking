package it.alten.flightbooking.controller;

import it.alten.flightbooking.model.Booking;
import it.alten.flightbooking.model.dto.BookingDto;
import it.alten.flightbooking.model.service.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Controller
@RequestMapping("/bookings")
public class FlightBookingSystemImpl implements FlightBookingSystem{

    private BookingService service;
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    @Override
    public ResponseEntity<Booking> bookFlight(BookingDto bookingDto) {

        Booking savedBooking = service.bookFlight(bookingDto);
        return new ResponseEntity<>(savedBooking, HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<List<Booking>> findAll() {
        List<Booking> users = service.getFlightBookings();
        return new ResponseEntity<>(users, HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<List<Booking>> findAllByPassenger(@PathVariable(value="passengerName") String passengerName) {
        List<Booking> users = service.getPassengerBooking(passengerName);
        return new ResponseEntity<>(users, HttpStatus.FOUND);
    }

    @Override
    public boolean delete(Long id) {

        return service.cancelBooking(id);
    }

    @Override
    public int getAvailableSeats(String flightNumber) {
        // metodo deve trovare flight tramide id e la relazione e restituire il numero di posti
        return 0;
    }

}
