package com.personal.sivaram.lld.parkinglot.parking;

import com.personal.sivaram.lld.parkinglot.vehicle.Vehicle;

public abstract class ParkingSpot {

    int floorNo;
    boolean isElectrical;
    boolean isFree;
    Vehicle vehicle;
    public abstract void parkVehicle(Vehicle vehicle);
    public abstract void removeVehicle();
    public abstract ParkingSpot getNextAvailableSlot();
}
