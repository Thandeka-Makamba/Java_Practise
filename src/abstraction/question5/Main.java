package abstraction.question5;

public class Main {
    public static void main(String[] args) {
        Appliance washingMachine = new WashingMachine();
        washingMachine.plugIn();
        washingMachine.turnOn();
        ((WashingMachine) washingMachine).saveEnergy();
    }

}
