package java_advanced_checkpoint.Question2;

public class Triangle implements Shape{

    private double base;

    private double height;

    private double hypotenous;

    public Triangle(double base, double height, double hypotenous) {
        this.base = base;
        this.height = height;
        this.hypotenous = hypotenous;
    }

    @Override
    public double calculateArea() {
        return 0.5 * this.base * this.height;
    }

    @Override
    public double calculatePerimeter() {
        return this.base + this.height + this.hypotenous;
    }
}
