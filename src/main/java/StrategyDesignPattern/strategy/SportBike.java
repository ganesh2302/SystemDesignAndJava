package StrategyDesignPattern.strategy;

public class SportBike extends Vehicle{
    SportBike() {
        super(new SportsDriveStrategy());
    }
}
