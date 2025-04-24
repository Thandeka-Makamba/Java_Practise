package inheritance.question9;

public class Main {
    public static void main(String[] args) {
        Account checking1 = new CheckingAccount();
        Account checking2 = new CheckingAccount();
        Account savings1 = new SavingsAccount();
        Account savings2 = new SavingsAccount();

        Account[] accounts = {checking1, checking2, savings1, savings2};
        for (Account acc: accounts) {
            printAccountType(acc);
        }
    }

    public static void printAccountType(Account account) {
        System.out.println("Reference: Account, Object:" + account.getClass().getSimpleName());
        account.displayType();
    }

}
