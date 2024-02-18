package NullDesignPattern;

public class Car implements Vehicle{
    @Override
    public int getTankCapacity() {
        return 4;
    }

    @Override
    public int seatCapacity() {
        return 4;
    }


}
