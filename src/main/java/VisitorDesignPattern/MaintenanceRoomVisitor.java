package VisitorDesignPattern;

public class MaintenanceRoomVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("perform single room maintenance");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("perform double room maintenance");
    }

    @Override
    public void visit(DeluxRoom deluxRoom) {
        System.out.println("perform delux room maintenance");
    }
}
