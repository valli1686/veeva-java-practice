import java.util.Scanner;

@FunctionalInterface
interface Calculator {
    long compute(int a, int b);
}

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculator calculator = (x, y) -> (long) Math.pow(x, y);

        System.out.println(calculator.compute(a, b));
    }
}