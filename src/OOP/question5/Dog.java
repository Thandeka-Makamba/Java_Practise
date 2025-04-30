package OOP.question5;

public class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
