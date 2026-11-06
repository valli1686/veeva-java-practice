import java.util.Scanner;

public class ShapeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        double area;

        switch (choice) {
            case 1:
                double radius = sc.nextDouble();
                area = 3.14 * radius * radius;
                System.out.printf("%.2f%n", area);
                break;

            case 2:
                double length = sc.nextDouble();
                double breadth = sc.nextDouble();
                area = length * breadth;
                System.out.printf("%.2f%n", area);
                break;

            case 3:
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                area = 0.5 * base * height;
                System.out.printf("%.2f%n", area);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}