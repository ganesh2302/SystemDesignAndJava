package ObserverDesignPattern.observer;

import ObserverDesignPattern.observable.NotifyObservable;

public class SMSObserver implements Observer{

    NotifyObservable observable;
    long phone;

    public SMSObserver(NotifyObservable observable, long phone) {
        this.observable = observable;
        this.phone = phone;
    }

    @Override
    public void update() {
        //send notification
    }


    public void sendSMS(){

    }
}
