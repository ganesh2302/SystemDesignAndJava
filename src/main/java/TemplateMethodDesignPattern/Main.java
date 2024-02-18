package TemplateMethodDesignPattern;

public class Main {

    public static void main(String args[]){
        PaymentFlow paymentFlow = new PaymentToFriend();
        paymentFlow.makePayment();
    }

}
