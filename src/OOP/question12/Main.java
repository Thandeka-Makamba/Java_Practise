package OOP.question12;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog(Mood.HAPPY);
        Animal cat = new Cat(Mood.SAD);

        Animal[] animals = {dog, cat};

        for (Animal animal: animals) {
            animal.makeSound();
        }
    }
}
