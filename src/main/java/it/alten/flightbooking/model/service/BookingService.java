package it.alten.flightbooking.model.service;

import it.alten.flightbooking.model.Booking;
import it.alten.flightbooking.model.dto.BookingDto;

import java.util.List;

public interface BookingService {

    Booking bookFlight(BookingDto bookingdto); // save

    List<Booking> getFlightBookings(); // find all

    List<Booking> getPassengerBooking(String name);

    List<Booking> cancelBooking(Long id);
}
