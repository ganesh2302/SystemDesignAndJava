package NullDesignPattern;

public class Bike implements Vehicle{
    @Override
    public int getTankCapacity() {
        return 2;
    }

    @Override
    public int seatCapacity() {
        return 2;
    }
}
