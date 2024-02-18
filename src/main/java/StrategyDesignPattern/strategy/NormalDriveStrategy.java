package StrategyDesignPattern.strategy;

public class NormalDriveStrategy implements DriveStrategy{


    @Override
    public void drive() {
        System.out.print("normal");
    }
}
