package abstraction.question5;

abstract class Appliance {

    abstract void turnOn();

    public void plugIn() {
        System.out.println("Appliance is plugged in.");
    }
}
