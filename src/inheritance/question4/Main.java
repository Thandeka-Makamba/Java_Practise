package inheritance.question4;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        ElectricCar electricCar = new ElectricCar();

        vehicle.start();
        car.start();
        electricCar.start();

        Vehicle myVehicle = new ElectricCar();
        myVehicle.start();
    }
}
