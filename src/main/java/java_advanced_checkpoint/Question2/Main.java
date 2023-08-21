package java_advanced_checkpoint.Question2;

import org.w3c.dom.ranges.DocumentRange;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(12.2);
        Rectangle rectangle = new Rectangle(1.5, 8.6);
        Triangle triangle = new Triangle(12, 16.2, 25.1);

        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());
    }
}
