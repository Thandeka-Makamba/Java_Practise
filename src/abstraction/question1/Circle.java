package abstraction.question1;

import java.lang.Math;

public class Circle extends Shape{
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
