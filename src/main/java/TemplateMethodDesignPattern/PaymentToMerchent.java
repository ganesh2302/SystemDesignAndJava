package TemplateMethodDesignPattern;

public class PaymentToMerchent extends PaymentFlow{
    @Override
    public void createRequest() {
        System.out.println("request for merchent created");
    }

    @Override
    public void debitMoney() {
        System.out.println("money debited from my account for merchent");
    }

    @Override
    public void creditMoney() {
        System.out.println("money credited to merchent");
    }
}
