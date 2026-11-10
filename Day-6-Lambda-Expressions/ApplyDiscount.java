import java.util.*;
import java.util.function.UnaryOperator;

public class ApplyDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] prices = new double[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextDouble();
        }

        double discount = sc.nextDouble();

        UnaryOperator<Double> applyDiscount =
            price -> price - (price * discount / 100);

        for (double price : prices) {
            System.out.printf("%.2f ",
                    applyDiscount.apply(price));
        }
    }
}