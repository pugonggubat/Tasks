interface Shape{
    double calculateArea();
    double calculatePerimeter();
}

abstract class AbstractShape implements Shape{
    private final String color;
    private final double width;
    private final double length;

    public AbstractShape(String color, double width, double length) {
        this.color = color;
        this.width = width;
        this.length = length;
    }


    public double calculateArea() {
        return width * length;
    }


    public double calculatePerimeter() {
        return 2 * (width + length);
    }

}

class Circle extends AbstractShape{
    private final double radius;

    public Circle(String color,double radius) {
        super(color,radius,radius);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends AbstractShape{
    public Rectangle(String color, double width, double length) {
        super(color, width, length);
    }
}

public class Task15 {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5);
        Shape rectangle = new Rectangle("Blue", 6, 4);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }


}
