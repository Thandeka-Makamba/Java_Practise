package abstraction.question7;

public class CreditCardPayment extends Payment implements Refundable{

    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of R" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding R" + amount + " to credit card");
    }
}
