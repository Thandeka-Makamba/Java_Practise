package inheritance.question2;

import inheritance.question1.*;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        Animal[] animals = {dog1, cat1, animal1};

        for (Animal obj: animals) {
            obj.makeSound();
        }
    }
}
