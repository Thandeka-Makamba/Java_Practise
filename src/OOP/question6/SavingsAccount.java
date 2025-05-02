package OOP.question6;

public class SavingsAccount extends BankAccount implements Taxable {

    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        double difference = this.getBalance() - amount;
        if (amount > this.getBalance()) {
            throw new IllegalArgumentException("Insufficient funds");
        } else if (difference < 1000.00) {
            throw new IllegalArgumentException("Balance must not fall below R1000.00");
        } else {
            this.reduceBalance(amount);
        }
    }

    @Override
    public void deductTax() {
        double taxAmount = this.getBalance() * 0.05;
        this.reduceBalance(taxAmount);
    }
}
