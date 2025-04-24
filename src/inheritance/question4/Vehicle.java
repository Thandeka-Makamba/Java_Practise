package inheritance.question4;

/*

Create a class Vehicle with a method start().

Create a subclass Car that extends Vehicle and overrides the start() method.

Create a subclass ElectricCar that extends Car and also overrides the start() method.

In the Main class, do the following:

Create one object for each class (Vehicle, Car, and ElectricCar).

Call the start() method on each one.

Then declare a variable like this:
Vehicle myVehicle = new ElectricCar();
And call myVehicle.start();

 */

public class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}
