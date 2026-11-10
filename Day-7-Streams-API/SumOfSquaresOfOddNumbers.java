import java.util.*;
import java.util.stream.*;

public class SumOfSquaresOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        int sum = numbers.stream()
                .filter(num -> num % 2 != 0)
                .map(num -> num * num)
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}