package it.alten.flightbooking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(name="booking")
public class Booking implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column

    private LocalDate flightDate;
    @Column
    @DateTimeFormat(pattern = "HH:mm:ss")

    private LocalDateTime arrivalTime;

    @Column
    @DateTimeFormat(pattern = "HH:mm:ss")
    private LocalDateTime departureTime;

    @Column

    private String departureAirport;

    @Column

    private String arrivalAirport;
    @Column

    private int bookedSeats;

    @Column
    private String passengerName;

//    @ManyToOne
//    @JoinColumn(name = "flight_id")
//    private Flight flight;

}
