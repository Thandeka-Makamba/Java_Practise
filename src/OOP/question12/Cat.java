package OOP.question12;

public class Cat extends Animal {

    Cat(Mood mood) {
        super(mood);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow... " + this.getMood().getDescription());
    }
}
