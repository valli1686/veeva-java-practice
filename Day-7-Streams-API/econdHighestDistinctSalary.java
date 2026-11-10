import java.util.*;
import java.util.stream.*;

public class SecondHighestDistinctSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> salaries = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            salaries.add(sc.nextInt());
        }

        Optional<Integer> result = salaries.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("None");
        }
    }
}