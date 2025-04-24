package inheritance.question6;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        Shape[] shapes = {circle, rectangle};
        for (Shape shape: shapes) {
            shape.draw();
        }
    }
}
