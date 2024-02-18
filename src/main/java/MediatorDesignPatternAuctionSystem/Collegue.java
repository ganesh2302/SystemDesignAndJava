package MediatorDesignPatternAuctionSystem;

public interface Collegue {
    public void placeBid(int amount);
    public void receiveNotification(int bid);
    public String getName();
}
