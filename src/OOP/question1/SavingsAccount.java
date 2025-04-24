package OOP.question1;

public class SavingsAccount extends BankAccount{

    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    void addInterest(double rate) {
        double newBalance = this.getBalance() + this.getBalance() * rate;
        this.setBalance(newBalance);
    }
}
