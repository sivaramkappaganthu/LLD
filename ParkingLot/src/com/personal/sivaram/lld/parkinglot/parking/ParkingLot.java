package com.personal.sivaram.lld.parkinglot.parking;

import com.personal.sivaram.lld.parkinglot.account.Address;
import com.personal.sivaram.lld.parkinglot.vehicle.Vehicle;

import java.util.HashMap;

public class ParkingLot {

    Address address;

    HashMap<String,ParkingTicket> parkingTickets;



    private static volatile ParkingLot  parkingLot = null;
    private ParkingLot(){

    }

    public ParkingLot getParkingLot(){
        if(parkingLot != null){
            synchronized (this){
                if(parkingLot != null){
                    parkingLot = new ParkingLot();
                }
            }
        }
        return parkingLot;
    }


    public ParkingTicket issueTicket(Vehicle vehicle){
        return null;
    }

    public boolean isParkingFull(ParkingSpot spot){
        return false;
    }

    public void printTicket(){

    }
}
