package com.aircraft.aircraft_services.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;


//@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "airline")
    private String airline;

    @Column(name = "source")
    private String source;

    @Column(name = "source_name")
    private String sourceName;

    @Column(name = "destination")
    private String destination;

    @Column(name = "destination_name")
    private String destinationName;

    @Column(name = "departure_date_time")
    private LocalDateTime departureDateTime;

    @Column(name = "arrival_date_time")
    private LocalDateTime arrivalDateTime;

    @Column(name = "duration_hours")
    private double durationHours;

    @Column(name = "stopovers")
    private String stopovers;

    @Column(name = "aircraft_type")
    private String aircraftType;

    @Column(name = "class_type")
    private String classType;

    @Column(name = "booking_source")
    private String bookingSource;

    @Column(name = "base_fare_bdt")
    private double baseFareBdt;

    @Column(name = "tax_and_surcharge_bdt")
    private double taxAndSurchargeBdt;

    @Column(name = "total_fare_bdt")
    private double totalFareBdt;

    @Column(name = "seasonality")
    private String seasonality;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public LocalDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(LocalDateTime departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public LocalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public double getDurationHours() {
        return durationHours;
    }

    public void setDurationHours(double durationHours) {
        this.durationHours = durationHours;
    }

    public String getStopovers() {
        return stopovers;
    }

    public void setStopovers(String stopovers) {
        this.stopovers = stopovers;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getBookingSource() {
        return bookingSource;
    }

    public void setBookingSource(String bookingSource) {
        this.bookingSource = bookingSource;
    }

    public double getBaseFareBdt() {
        return baseFareBdt;
    }

    public void setBaseFareBdt(double baseFareBdt) {
        this.baseFareBdt = baseFareBdt;
    }

    public double getTaxAndSurchargeBdt() {
        return taxAndSurchargeBdt;
    }

    public void setTaxAndSurchargeBdt(double taxAndSurchargeBdt) {
        this.taxAndSurchargeBdt = taxAndSurchargeBdt;
    }

    public double getTotalFareBdt() {
        return totalFareBdt;
    }

    public void setTotalFareBdt(double totalFareBdt) {
        this.totalFareBdt = totalFareBdt;
    }

    public String getSeasonality() {
        return seasonality;
    }

    public void setSeasonality(String seasonality) {
        this.seasonality = seasonality;
    }

}