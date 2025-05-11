package composition.question2;

public class Car {

    Engine engine = new Engine();
    Radio radio = new Radio();

    public void drive() {
        System.out.println("Car is starting...");
        engine.start();
        radio.playMusic();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
