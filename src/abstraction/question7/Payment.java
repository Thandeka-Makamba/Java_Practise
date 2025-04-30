package abstraction.question7;

abstract public class Payment {

    abstract void processPayment(double amount);

    void printReceipt() {
        System.out.println("Printing receipt...");
    }
}
