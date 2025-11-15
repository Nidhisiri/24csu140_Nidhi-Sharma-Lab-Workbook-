public class Circle implements GeometricObject {
    protected double radius = 1.0;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override methods from GeometricObject
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
