package inheritance.question1;

public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println("Dog is fetching the ball!");
    }
}
