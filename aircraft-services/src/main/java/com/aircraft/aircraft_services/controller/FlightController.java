package com.aircraft.aircraft_services.controller;

import com.aircraft.aircraft_services.Model.Flight;
import com.aircraft.aircraft_services.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;

    @GetMapping("/find/{source}/{destination}/{strDate}")
    public List<Flight> getFlightDetails(@PathVariable String source, @PathVariable String destination, @PathVariable String strDate) {
        //LocalDateTime departureDateTime = LocalDate.parse((strDate.trim())).atStartOfDay();
        LocalDate departureDate = LocalDate.parse(strDate.trim()); // Extract only the date
        LocalDateTime startOfDay = departureDate.atStartOfDay();  // Convert to LocalDateTime at 00:00

        LocalDateTime endOfDay = departureDate.atTime(23, 59, 59); // Optional: For checking within the full day range

        return flightService.getFlightDetails(source, destination, startOfDay, endOfDay);
    }

    @GetMapping("/getAll")
    public List<Flight> getFlights(){
        return flightService.getFlights();
    }
}
