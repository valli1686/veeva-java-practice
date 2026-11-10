import java.util.Scanner;

interface DiscountStrategy {
    double calculatePayable(double amount);
}

class RegularDiscount implements DiscountStrategy {
    public double calculatePayable(double amount) {
        return amount - (amount * 0.05);
    }
}

class PremiumDiscount implements DiscountStrategy {
    public double calculatePayable(double amount) {
        return amount - (amount * 0.15);
    }
}

public class DiscountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        double amount = sc.nextDouble();

        if (amount < 0) {
            System.out.println("Invalid Amount");
            return;
        }

        DiscountStrategy strategy;

        if (type.equals("R")) {
            strategy = new RegularDiscount();
        } else {
            strategy = new PremiumDiscount();
        }

        System.out.printf("%.2f%n",
                strategy.calculatePayable(amount));
    }
}