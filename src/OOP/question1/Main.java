package OOP.question1;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("Thande123", 1000.0);

        savingsAccount.deposit(1000.0);
        savingsAccount.addInterest(0.05);
        System.out.println(savingsAccount.getBalance());
    }
}
