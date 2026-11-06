import java.util.Scanner;

public class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                System.out.println(i);
                return;
            }

            leftSum += arr[i];
        }

        System.out.println(-1);
    }
}