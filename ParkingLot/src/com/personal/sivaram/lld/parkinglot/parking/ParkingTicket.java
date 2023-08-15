package com.personal.sivaram.lld.parkinglot.parking;

import com.personal.sivaram.lld.parkinglot.vehicle.Vehicle;

import java.time.Duration;
import java.time.LocalDateTime;

public class ParkingTicket {

    long ticketId;
    LocalDateTime entryTime;
    LocalDateTime exitTime;
    Duration parkedTime;
    Double priceCharged;
    Vehicle vehicle;

    public  ParkingTicket getParkingTicket(){
        return new ParkingTicket();
    }

    public double calculatePrice(Vehicle vehicle, Duration duration){
        return 0.00;
    }

}
