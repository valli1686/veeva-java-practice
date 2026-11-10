import java.util.Scanner;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        Shape shape;

        if (type.equals("C")) {
            double radius = sc.nextDouble();
            shape = new Circle(radius);
        } else {
            double length = sc.nextDouble();
            double width = sc.nextDouble();
            shape = new Rectangle(length, width);
        }

        System.out.printf("Area: %.2f%n", shape.area());
    }
}