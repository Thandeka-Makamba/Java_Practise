package abstraction.question1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.display();
        System.out.println("Area: " + circle.getArea());
    }
}
