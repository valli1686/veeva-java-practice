import java.util.Scanner;

class Product {
    private String productId;
    private String name;
    private double price;

    Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.printf("%s %s %.2f%n", productId, name, price);
    }
}

public class ProductDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = sc.next();
        String name = sc.next();
        double price = sc.nextDouble();

        if (price < 0) {
            System.out.println("Invalid Price");
        } else {
            Product p = new Product(id, name, price);
            p.display();
        }

        sc.close();
    }
}