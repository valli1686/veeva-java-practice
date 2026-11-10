import java.util.*;
import java.util.stream.*;

public class GroupTransactionsByCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String, Double> result = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String category = sc.next();
            double amount = sc.nextDouble();

            result.merge(category, amount, Double::sum);
        }

        result.forEach((category, total) ->
                System.out.printf("%s %.2f%n", category, total));
    }
}