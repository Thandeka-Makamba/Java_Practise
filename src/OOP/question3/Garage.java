package OOP.question3;

public class Garage {
    public static void main(String[] args) {
        Vehicle car = new Car("Honda", "Pilot", 2023, 4);
        Vehicle motorcycle = new Motorcycle("Honda", "CBR600RR", 2022, false);

        Vehicle[] vehicles = {car, motorcycle};
        for (Vehicle vehicle: vehicles) {
            vehicle.displayInfo();
            vehicle.startEngine();
        }
    }
}
