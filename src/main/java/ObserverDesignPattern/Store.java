package ObserverDesignPattern;

import ObserverDesignPattern.observable.IphoneObservable;
import ObserverDesignPattern.observable.NotifyObservable;
import ObserverDesignPattern.observer.EmailObservar;
import ObserverDesignPattern.observer.Observer;
import ObserverDesignPattern.observer.SMSObserver;

public class Store {

    public static void main(String args[]){
        NotifyObservable iphoneObservable = new IphoneObservable();

        Observer obj1 = new SMSObserver(iphoneObservable, 704429624);
        Observer obj2 = new EmailObservar(iphoneObservable, "abc@gmail.com");

        iphoneObservable.addSubscriber(obj1);
        iphoneObservable.addSubscriber(obj2);

        iphoneObservable.setStockCount(10);
    }



}
