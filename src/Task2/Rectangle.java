package Task2;

public class Rectangle extends ToShape {
    public Rectangle() {
        super(10, 10);
    }

    public Rectangle(double width, double height) {
        super(width, height);
    }

    public double calculatePerimeter() {
        return (height + width) * 2;
    }

    public double calculateArea() {
        return height * width;
    }
}
