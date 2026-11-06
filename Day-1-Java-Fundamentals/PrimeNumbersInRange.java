import java.util.Scanner;

public class PrimeNumbersInRange {

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();

        boolean found = false;

        for (int i = l; i <= r; i++) {
            if (isPrime(i)) {
                if (found) {
                    System.out.print(" ");
                }

                System.out.print(i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }
    }
}