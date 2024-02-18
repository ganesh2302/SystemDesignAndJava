package ObserverDesignPattern.observable;

import ObserverDesignPattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements NotifyObservable {

    List<Observer> observerList =  new ArrayList<Observer>();
    int stockCount =0;

    @Override
    public void notifySubscriber() {
        for(Observer obj:observerList){
            obj.update();
        }
    }

    @Override
    public void addSubscriber(Observer obj) {
        observerList.add(obj);
    }


    @Override
    public void removeSubscriber(Observer obj) {
        observerList.remove(obj);
    }


    @Override
    public void setStockCount(int n) {
        if(n==0){
            notifySubscriber();
        }else{
            stockCount +=n;
        }
    }

    @Override
    public int getStockCount() {
        return 0;
    }
}
