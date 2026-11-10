import java.util.*;
import java.util.stream.*;

class Product {
    String name;
    int quantity;
    double price;

    Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    double revenue() {
        return quantity * price;
    }
}

public class TopThreeProductsByRevenue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Product> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int quantity = sc.nextInt();
            double price = sc.nextDouble();

            products.add(new Product(name, quantity, price));
        }

        List<Product> result = products.stream()
                .sorted(Comparator.comparingDouble(Product::revenue)
                        .reversed()
                        .thenComparing(product -> product.name))
                .limit(3)
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            System.out.println("None");
        } else {
            result.forEach(product ->
                    System.out.printf("%s %.2f%n",
                            product.name, product.revenue()));
        }
    }
}