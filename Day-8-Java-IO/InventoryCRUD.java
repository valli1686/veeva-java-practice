import java.io.*;
import java.nio.file.*;
import java.util.*;

public class InventoryCRUD {
    static class Item {
        String id;
        String name;
        int quantity;

        Item(String id, String name, int quantity) {
            this.id = id;
            this.name = name;
            this.quantity = quantity;
        }

        public String toString() {
            return id + "," + name + "," + quantity;
        }
    }

    static void saveItems(String path, Map<String, Item> items)
            throws IOException {

        Path file = Paths.get(path);
        Path temp = file.resolveSibling(file.getFileName() + ".tmp");

        try (BufferedWriter bw = Files.newBufferedWriter(temp)) {
            for (Item item : items.values()) {
                bw.write(item.toString());
                bw.newLine();
            }
        }

        try {
            Files.move(temp, file,
                    StandardCopyOption.REPLACE_EXISTING,
                    StandardCopyOption.ATOMIC_MOVE);
        } catch (AtomicMoveNotSupportedException e) {
            Files.move(temp, file,
                    StandardCopyOption.REPLACE_EXISTING);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String path = sc.nextLine();
        Map<String, Item> items = new LinkedHashMap<>();

        try {
            File file = new File(path);

            if (file.exists()) {
                try (BufferedReader br = new BufferedReader(
                        new FileReader(file))) {

                    String line;

                    while ((line = br.readLine()) != null) {
                        String[] data = line.split(",");

                        if (data.length == 3) {
                            Item item = new Item(
                                    data[0],
                                    data[1],
                                    Integer.parseInt(data[2])
                            );

                            items.put(item.id, item);
                        }
                    }
                }
            }

            int q = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < q; i++) {
                String[] operation = sc.nextLine().trim().split("\\s+");

                switch (operation[0]) {
                    case "ADD": {
                        String id = operation[1];
                        String name = operation[2];
                        int quantity = Integer.parseInt(operation[3]);

                        if (items.containsKey(id)) {
                            System.out.println("Duplicate ID");
                        } else {
                            items.put(id, new Item(id, name, quantity));
                            saveItems(path, items);
                            System.out.println("Added");
                        }
                        break;
                    }

                    case "UPDATE": {
                        String id = operation[1];
                        int quantity = Integer.parseInt(operation[2]);

                        if (!items.containsKey(id)) {
                            System.out.println("Not Found");
                        } else {
                            items.get(id).quantity = quantity;
                            saveItems(path, items);
                            System.out.println("Updated");
                        }
                        break;
                    }

                    case "DELETE": {
                        String id = operation[1];

                        if (!items.containsKey(id)) {
                            System.out.println("Not Found");
                        } else {
                            items.remove(id);
                            saveItems(path, items);
                            System.out.println("Deleted");
                        }
                        break;
                    }

                    case "SEARCH": {
                        String id = operation[1];

                        if (!items.containsKey(id)) {
                            System.out.println("Not Found");
                        } else {
                            System.out.println(items.get(id));
                        }
                        break;
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("File Error");
        }
    }
}