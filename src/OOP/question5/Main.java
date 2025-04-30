package OOP.question5;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Spotty");
        Animal cat = new Cat("Nala");

        Animal[] animals = {dog, cat};
        for (Animal animal: animals) {
            animal.displayInfo();
            animal.makeSound();
        }
    }
}
