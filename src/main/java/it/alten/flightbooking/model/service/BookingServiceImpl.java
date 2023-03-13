package it.alten.flightbooking.model.service;

import it.alten.flightbooking.model.Booking;
import it.alten.flightbooking.model.dto.BookingDto;
import it.alten.flightbooking.repository.BookingRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService{

    @Autowired
    BookingRepo repo;

    @Override
    public Booking bookFlight(BookingDto bookingdto) {
        ModelMapper modelMapper = new ModelMapper();

        return repo.save(modelMapper.map(bookingdto, Booking.class));
    }

    @Override
    public List<Booking> getFlightBookings() {

        return repo.findAll();
    }

    @Override
    public List<Booking> getPassengerBooking(String name) {

        return repo.findByPassengerName(name);
    }

    @Override
    public List<Booking> cancelBooking(Long id) {
        Booking bookingToDelete = repo.findById(id).get();

        repo.delete(bookingToDelete);
        return repo.findAll();

    }
}
