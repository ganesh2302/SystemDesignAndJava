package TemplateMethodDesignPattern;

public class PaymentToFriend extends PaymentFlow{
    @Override
    public void createRequest() {
        System.out.println("payment to friend request created");
    }

    @Override
    public void debitMoney() {
        System.out.println("money debited from my account");
    }

    @Override
    public void creditMoney() {
        System.out.println("money credited to friend account");
    }
}
