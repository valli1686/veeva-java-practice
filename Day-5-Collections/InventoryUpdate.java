import java.util.*;

public class InventoryUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        TreeMap<String, Integer> inventory = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String product = sc.next();
            int quantity = sc.nextInt();

            inventory.put(product, quantity);
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            String product = sc.next();
            int change = sc.nextInt();

            if (inventory.containsKey(product)) {
                int updated = inventory.get(product) + change;

                if (updated >= 0) {
                    inventory.put(product, updated);
                }
            } else if (change > 0) {
                inventory.put(product, change);
            }
        }

        for (String product : inventory.keySet()) {
            System.out.println(product + " " + inventory.get(product));
        }
    }
}