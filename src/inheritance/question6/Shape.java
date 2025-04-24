package inheritance.question6;

/*

Create a class called Shape with a method draw() that prints "Drawing shape". Then create two subclasses: Circle and Rectangle. Each subclass should override the draw() method to print "Drawing circle" and "Drawing rectangle", respectively.

In the Main class, create an array of Shape objects (including Circle and Rectangle) and iterate over the array to call the draw() method on each object. Make sure to demonstrate polymorphism by storing objects of Circle and Rectangle in a Shape reference.

 */

public class Shape {
    public void draw() {
        System.out.println("Drawing shape");
    }
}
