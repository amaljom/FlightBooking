package it.alten.flightbooking.service;

import it.alten.flightbooking.model.Booking;
import it.alten.flightbooking.model.dto.BookingDto;

import java.util.List;

public interface BookingService {

    Booking bookFlight(BookingDto bookingDto); // save

    List<Booking> getFlightBookings(); // find all

    List<Booking> getPassengerBooking(String name);

    boolean cancelBooking(Long id);
}
