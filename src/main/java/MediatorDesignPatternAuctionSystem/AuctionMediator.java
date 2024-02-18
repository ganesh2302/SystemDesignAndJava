package MediatorDesignPatternAuctionSystem;

public interface AuctionMediator {

    public void addBidder(Collegue bidder);
    public void placeBid(Collegue bidder, int bidAmount);
}
