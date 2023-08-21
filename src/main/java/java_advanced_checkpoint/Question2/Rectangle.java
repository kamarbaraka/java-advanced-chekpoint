package java_advanced_checkpoint.Question2;

public class Rectangle implements Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.length * this.width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }
}
