package com.aircraft.aircraft_services.service;

import com.aircraft.aircraft_services.Model.Flight;
import com.aircraft.aircraft_services.repo.Flightrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class    FlightService {
    @Autowired
    private Flightrepo flightrepo;

    public List<Flight> getFlightDetails(String src, String dest, LocalDateTime startOfDay, LocalDateTime endOfDay) {
        return flightrepo.findBySourceAndDestinationAndDepartureDateTimeBetween(src, dest, startOfDay, endOfDay);
    }

    public List<Flight> getFlights(){
        return flightrepo.findAll();
    }
}
