package OOP.question6;

public class Main {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount("Tha123", 2000.00);
        BankAccount checkingAccount = new CheckingAccount("Tha124", 3000.00);

        BankAccount[] accounts = {savingsAccount, checkingAccount};

        for (BankAccount account: accounts) {
            try {
                if (account instanceof SavingsAccount) {
                    account.displayInfo();
                    account.deposit(200.00);
                    account.withdraw(5000.00);
                    ((SavingsAccount) account).deductTax();
                    account.displayInfo();
                    System.out.println();
                } else {
                    account.displayInfo();
                    account.deposit(1000.00);
                    account.withdraw(2000.00);
                    account.displayInfo();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error in account: " + account.getAccountNumber() + ", Error: " + e.getMessage());
            }
        }
    }
}
