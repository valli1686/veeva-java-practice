import java.util.Scanner;

public class Calculator {

    static int calculate(int a, int b) {
        return a + b;
    }

    static int calculate(int a, int b, int c) {
        return a + b + c;
    }

    static double calculate(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(calculate(a, b));
                break;

            case 2:
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                System.out.println(calculate(x, y, z));
                break;

            case 3:
                double p = sc.nextDouble();
                double q = sc.nextDouble();
                System.out.println(calculate(p, q));
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}