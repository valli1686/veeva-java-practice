import java.util.*;
import java.util.stream.*;

public class DistinctSortedNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        List<Integer> result = numbers.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            System.out.println("None");
        } else {
            result.forEach(num -> System.out.print(num + " "));
        }
    }
}