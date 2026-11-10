import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        TreeSet<Integer> first = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            first.add(sc.nextInt());
        }

        int m = sc.nextInt();
        HashSet<Integer> second = new HashSet<>();

        for (int i = 0; i < m; i++) {
            second.add(sc.nextInt());
        }

        first.retainAll(second);

        if (first.isEmpty()) {
            System.out.println("None");
        } else {
            for (int num : first) {
                System.out.print(num + " ");
            }
        }
    }
}