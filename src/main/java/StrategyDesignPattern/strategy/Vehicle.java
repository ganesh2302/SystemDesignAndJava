package StrategyDesignPattern.strategy;

public class Vehicle {
    DriveStrategy driveObj;

    //constructor injection
    Vehicle(DriveStrategy drive){
        this.driveObj = drive;
    }

    public void drive(){
        driveObj.drive();
    }

}
