package NullDesignPattern;

public class VehicleFactory {

    public static Vehicle getVehicle(String type){
        if(type.equals("Bike")) return new Bike();
        else if (type.equals("Car")) return new Car();
        else return new DefaultVehicle();
    }
}
