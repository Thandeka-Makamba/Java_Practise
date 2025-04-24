package inheritance.question10;

public class Teacher extends Person{
    @Override
    public void greet() {
        System.out.println("Hello from Teacher");
    }

    public void teach() {
        System.out.println("Teaching students");
    }
}
