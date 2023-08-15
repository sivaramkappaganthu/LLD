package com.personal.sivaram.lld.elevator;

public class Elevator {
    int id;
    Door door;
    Display display;
    ElevatorPanel panel;
    ElevatorStatus elevatorStatus;
    Direction direction;
    int currentFloor;

    public void move(Direction direction){
        System.out.println("Moving in:" + direction);
    }

}
