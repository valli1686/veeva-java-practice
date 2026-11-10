import java.util.*;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        list.removeIf(num -> num % 2 == 0);

        if (list.isEmpty()) {
            System.out.println("None");
        } else {
            list.forEach(num -> System.out.print(num + " "));
        }
    }
}