package VisitorDesignPattern;

public class SingleRoom implements RoomElement{
    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
