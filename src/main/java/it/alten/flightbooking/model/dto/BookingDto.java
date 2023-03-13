package it.alten.flightbooking.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
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
