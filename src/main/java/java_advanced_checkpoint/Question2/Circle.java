package java_advanced_checkpoint.Question2;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {

        return Math.PI * (this.radius * this.radius);
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * (this.radius * 2);
    }
}
