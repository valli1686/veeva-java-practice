import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();

            if (value > largest) {
                second = largest;
                largest = value;
            } else if (value < largest && value > second) {
                second = value;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("None");
        } else {
            System.out.println(second);
        }
    }
}