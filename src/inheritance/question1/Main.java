package inheritance.question1;

public class Main {
    public static void main(String[] args) {

        // Question1
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.makeSound();
        dog.makeSound();

        //Question 2
        Cat cat = new Cat();
        Animal[] animals = {dog, cat, animal};

        for (Animal obj: animals) {
            obj.makeSound();
        }

        //Question 3

        for (Animal obj: animals) {
            if (obj instanceof Dog) {
                obj.makeSound();
                ((Dog) obj).fetch();
            } else {
                obj.makeSound();
            }
        }
    }
}
