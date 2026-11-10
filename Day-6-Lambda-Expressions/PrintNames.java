import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class PrintNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            names.add(sc.next());
        }

        AtomicInteger index = new AtomicInteger(1);

        names.forEach(name ->
            System.out.println(index.getAndIncrement() + ". " + name)
        );
    }
}