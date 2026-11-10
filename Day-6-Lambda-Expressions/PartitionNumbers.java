import java.util.*;
import java.util.function.Predicate;

public class PartitionNumbers {

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        Predicate<Integer> prime = num -> isPrime(num);

        ArrayList<Integer> primes = new ArrayList<>();
        ArrayList<Integer> nonPrimes = new ArrayList<>();

        for (int num : numbers) {
            if (prime.test(num)) {
                primes.add(num);
            } else {
                nonPrimes.add(num);
            }
        }

        Collections.sort(primes);
        Collections.sort(nonPrimes);

        if (primes.isEmpty()) {
            System.out.println("None");
        } else {
            primes.forEach(num -> System.out.print(num + " "));
            System.out.println();
        }

        nonPrimes.forEach(num -> System.out.print(num + " "));
    }
}