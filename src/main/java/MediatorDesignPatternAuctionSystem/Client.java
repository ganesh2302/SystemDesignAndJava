package MediatorDesignPatternAuctionSystem;

public class Client {
    public static void main(String[] args) {

        AuctionMediator auctionMediator = new Auction();
        Collegue b1 = new Bidder("ABC",auctionMediator);
        Collegue b2 = new Bidder("DEF", auctionMediator);

        auctionMediator.addBidder(b1);
        auctionMediator.addBidder(b2);

        b1.placeBid(100);
        b2.placeBid(200);
        b1.placeBid(250);
    }
}
