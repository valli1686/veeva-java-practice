import java.util.Scanner;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int currentSum = sc.nextInt();
        int maxSum = currentSum;

        for (int i = 1; i < n; i++) {
            int value = sc.nextInt();

            currentSum = Math.max(value, currentSum + value);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);
    }
}