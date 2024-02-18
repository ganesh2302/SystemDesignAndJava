package VisitorDesignPattern;

public class RoomAcceptVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("single room booking accepted");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("double room booking accepted");
    }

    @Override
    public void visit(DeluxRoom deluxRoom) {
        System.out.println("delux room booking accepted");
    }
}
