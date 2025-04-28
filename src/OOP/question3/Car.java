package OOP.question3;

public class Car extends Vehicle{
    private int numberOfDoors;

    Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Make: " + this.getMake() + ", Model: " + this.getModel() + ", Year: " + this.getYear() + ", Number of Doors: " + numberOfDoors);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine starts with a roar.");
    }
}
