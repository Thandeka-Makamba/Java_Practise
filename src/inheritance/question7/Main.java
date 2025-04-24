package inheritance.question7;

public class Main {

    public static void makeSound(Animal animal) {
        animal.sound();
    }

    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal elephant = new Elephant();

        makeSound(lion);
        makeSound(elephant);
    }
}
