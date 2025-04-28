package OOP.question3;

public class Motorcycle extends Vehicle{
    private boolean hasSidecar;

    Motorcycle(String make, String model, int year, boolean hasSidecar) {
        super(make, model, year);
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Make: " + this.getMake() + ", Model: " + this.getModel() + ", Year: " + this.getYear() + ", Has sidecar: " + this.hasSidecar());
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine starts with a rumble.");
    }
}
