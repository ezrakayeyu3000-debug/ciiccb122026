// The Interface
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// 2. The Abstract Class
abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

    // Constructor
    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    // We can leave the methods abstract here, 
    // or provide default implementations. The task says "Implementations for the... methods", 
    // so we'll leave them abstract for the subclasses to define based on their specific shape.
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// 3a. Concrete Class: Circle
class Circle extends AbstractShape {
    double radius;

    // Circle only needs a radius
    public Circle(String color, double radius) {
        super(color, 0, 0); // length and width not used for circle
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

// 3b. Concrete Class: Rectangle
class Rectangle extends AbstractShape {
    
    // Rectangle uses the length and width from the abstract class
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// 4. Main Class
public class Task15 {
    public static void main(String[] args) {
        // Create instances
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        // Display Circle details
        System.out.println("--- Circle ---");
        System.out.println("Color: " + circle.color);
        System.out.println("Radius: " + circle.radius);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        // Display Rectangle details
        System.out.println("\n--- Rectangle ---");
        System.out.println("Color: " + rectangle.color);
        System.out.println("Length: " + rectangle.length);
        System.out.println("Width: " + rectangle.width);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}