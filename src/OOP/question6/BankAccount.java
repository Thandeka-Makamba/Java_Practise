package OOP.question6;

abstract public class BankAccount {

    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void reduceBalance(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        if (amount <= 0.0) {
            throw new IllegalArgumentException("Amount deposited must be positive");
        } else {
            balance += amount;
        }
    }

    abstract public void withdraw(double amount);

    public void displayInfo() {
        System.out.println("Account Number: " + this.getAccountNumber() + "\nBalance: R" + this.getBalance());
    }
}
