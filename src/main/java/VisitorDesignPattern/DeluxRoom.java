package VisitorDesignPattern;

public class DeluxRoom implements RoomElement{
    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
