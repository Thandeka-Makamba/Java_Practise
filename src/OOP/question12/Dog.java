package OOP.question12;

public class Dog extends Animal {

    Dog(Mood mood) {
        super(mood);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! " + this.getMood().getDescription());
    }
}
