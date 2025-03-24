package com.aircraft.aircraft_services.repo;

import com.aircraft.aircraft_services.Model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface Flightrepo extends JpaRepository<Flight,Long> {
    List<Flight> findBySourceAndDestinationAndDepartureDateTimeBetween(
            String source, String destination, LocalDateTime startOfDay, LocalDateTime endOfDay
    );
}
