package abstraction.question5;

public class WashingMachine extends Appliance implements EnergySaver {

    @Override
    void turnOn() {
        System.out.println("Washing machine is on");
    }

    @Override()
    public void saveEnergy() {
        System.out.println("Washing machine is saving energy");
    }
}
