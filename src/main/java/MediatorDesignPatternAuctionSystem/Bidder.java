package MediatorDesignPatternAuctionSystem;

public class Bidder implements Collegue{

    String name;
    AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
    }

    @Override
    public void placeBid(int amount) {
        auctionMediator.placeBid(this,amount);
    }

    @Override
    public void receiveNotification(int bid) {
        System.out.println("Bidder "+this.getName()+" is notified that someone has put bid of amount "+ bid);
    }

    @Override
    public String getName() {
        return name;
    }
}
