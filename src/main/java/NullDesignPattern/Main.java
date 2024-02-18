package NullDesignPattern;

public class Main {
    public static void main(String args[]){
        Vehicle vehicle = VehicleFactory.getVehicle("Cycle");
        System.out.println(vehicle.getTankCapacity());
        System.out.println(vehicle.seatCapacity());
    }

}
