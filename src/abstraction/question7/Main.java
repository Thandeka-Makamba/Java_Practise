package abstraction.question7;

public class Main {
    public static void main(String[] args) {
        CreditCardPayment payment = new CreditCardPayment();
        payment.processPayment(2000.0);
        payment.refund(100.0);
        payment.printReceipt();
    }
}
