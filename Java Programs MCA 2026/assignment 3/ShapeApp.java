abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    abstract double calculateArea();
    abstract void draw();
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    void draw() {
        System.out.println("Drawing " + color + " Circle");
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(String color, double length, double breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea() {
        return length * breadth;
    }

    void draw() {
        System.out.println("Drawing " + color + " Rectangle");
    }
}

public class ShapeApp {
    public static void main(String[] args) {
        try {
            Shape c = new Circle("Red", 5);
            Shape r = new Rectangle("Blue", 4, 6);

            c.draw();
            System.out.println("Area = " + c.calculateArea());

            r.draw();
            System.out.println("Area = " + r.calculateArea());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}