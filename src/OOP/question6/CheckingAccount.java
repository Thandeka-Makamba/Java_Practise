package OOP.question6;

public class CheckingAccount extends BankAccount {

    CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > this.getBalance()) {
            throw new IllegalArgumentException("Insufficient funds");
        } else {
            this.reduceBalance(amount);
        }
    }
}
