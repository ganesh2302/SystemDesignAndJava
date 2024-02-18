package VisitorDesignPattern;

public class Client {

    public static void main(String[] args) {
        RoomElement singleRoom = new SingleRoom();

        RoomVisitor mainten = new MaintenanceRoomVisitor();
        singleRoom.accept(mainten);

    }
}
