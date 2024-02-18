package MediatorDesignPatternAuctionSystem;

import java.util.ArrayList;

public class Auction implements AuctionMediator{

    ArrayList<Collegue> bidderList = new ArrayList<>();
    @Override
    public void addBidder(Collegue bidder) {
        bidderList.add(bidder);
    }

    @Override
    public void placeBid(Collegue bidder, int bidAmount) {
        for(Collegue collegue:bidderList){
            if(!collegue.getName().equals(bidder.getName())){
                collegue.receiveNotification(bidAmount);
            }
        }
    }
}
