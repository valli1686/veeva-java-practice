import java.util.Scanner;

interface Payment {
    double pay(double amount);
}

class CardPayment implements Payment {
    public double pay(double amount) {
        return amount + (amount * 0.02);
    }
}

class UpiPayment implements Payment {
    public double pay(double amount) {
        return amount;
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        double amount = sc.nextDouble();

        Payment payment;

        if (type.equals("C")) {
            payment = new CardPayment();
        } else {
            payment = new UpiPayment();
        }

        System.out.printf("Total charged: %.2f%n",
                payment.pay(amount));
    }
}