import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedHashSet<String> names = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            names.add(sc.next());
        }

        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}