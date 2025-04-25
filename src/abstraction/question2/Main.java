package abstraction.question2;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        dog.sleep();
        cat.makeSound();
        cat.sleep();
    }
}
