package NullDesignPattern;

public class DefaultVehicle implements Vehicle{
    @Override
    public int getTankCapacity() {
        return 0;
    }

    @Override
    public int seatCapacity() {
        return 0;
    }
}
