package ObserverDesignPattern.observer;

import ObserverDesignPattern.observable.NotifyObservable;

public class EmailObservar implements Observer{

    NotifyObservable observable;
    String email;

    public EmailObservar(NotifyObservable observable, String email) {
        this.observable = observable;
        this.email = email;
    }

    @Override
    public void update() {
        //notify user
    }

    public void sendEmail(){
        //send email
    }
}
