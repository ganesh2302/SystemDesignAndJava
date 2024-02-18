package VisitorDesignPattern;

public class DoubleRoom implements RoomElement{
    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
