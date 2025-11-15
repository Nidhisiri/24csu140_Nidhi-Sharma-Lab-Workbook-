public class ResizableCircle extends Circle implements Resizable {

    // Constructor calls parent constructor using super
    public ResizableCircle(double radius) {
        super(radius);
    }

    // Override resize method
    public void resize(int percent) {
        radius = radius * percent / 100.0;
    }
}
