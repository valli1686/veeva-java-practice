import java.util.Scanner;

class Discount {
    static double calculateFinalAmount(double amount) {
        if (amount >= 5000) {
            return amount * 0.90;
        } else if (amount >= 2000) {
            return amount * 0.95;
        } else {
            return amount;
        }
    }
}

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double amount = sc.nextDouble();

        double result = Discount.calculateFinalAmount(amount);

        System.out.printf("%.2f%n", result);

        sc.close();
    }
}