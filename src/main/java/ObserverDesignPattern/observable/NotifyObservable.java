package ObserverDesignPattern.observable;

import ObserverDesignPattern.observer.Observer;

public interface NotifyObservable {


    public  void notifySubscriber();

    public void addSubscriber(Observer obj);
    public void removeSubscriber(Observer obj);

    public void setStockCount(int n);

    public int getStockCount();

}
