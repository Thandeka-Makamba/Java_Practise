package abstraction.question6;

public class Developer extends Employee implements BonusEligible{

    @Override
    void work() {
        System.out.println("Writing code");
    }

    @Override
    public void receiveBonus() {
        System.out.println("Developer received bonus");
    }
}
