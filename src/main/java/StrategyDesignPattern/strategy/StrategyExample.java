package StrategyDesignPattern.strategy;

public class StrategyExample {
    public static void main(String args[]){
        Vehicle vehicle = new SportBike();
        vehicle.drive();
    }
}
