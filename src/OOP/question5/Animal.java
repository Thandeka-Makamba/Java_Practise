package OOP.question5;

abstract public class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();

    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}
