package it.alten.flightbooking.model.dto;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class BookingDto {

    private Long id;

    private LocalDate flightDate;

    private LocalDateTime arrivalTime;

    private LocalDateTime departureTime;

    private String departureAirport;

    private String arrivalAirport;

    private int bookedSeats;

    private String passengerName;
}
