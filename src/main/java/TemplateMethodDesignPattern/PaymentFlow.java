package TemplateMethodDesignPattern;

public abstract class PaymentFlow {

    public abstract void createRequest();

    public abstract void debitMoney();
    public abstract void creditMoney();

    //this method is like a template which has order of methods to be executed.
    public final void makePayment(){
        createRequest();
        debitMoney();
        creditMoney();
    }

}