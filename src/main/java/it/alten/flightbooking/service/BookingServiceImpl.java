package it.alten.flightbooking.service;

import it.alten.flightbooking.model.Booking;
import it.alten.flightbooking.model.dto.BookingDto;
import it.alten.flightbooking.repository.BookingRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class BookingServiceImpl implements BookingService{

    @Autowired
    BookingRepo repo;
    @Override
    public Booking bookFlight(BookingDto bookingDto) {
        ModelMapper modelMapper = new ModelMapper();

        return repo.save(modelMapper.map(bookingDto, Booking.class));
    }

    @Override
    public List<Booking> getFlightBookings() {

        return repo.findAll();
    }

    @Override
    public List<Booking> getPassengerBooking(String name) {

        return repo.findByName(name);
    }

    @Override
    public boolean cancelBooking(Long id) {
        Booking bookingToDelete = repo.findById(id).get();
        repo.delete(bookingToDelete);
        return true;
    }
}
