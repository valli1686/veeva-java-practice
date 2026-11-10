import java.util.Scanner;

public class ArrayElement {

    static int getElement(int[] arr, int index)
            throws ArrayIndexOutOfBoundsException {

        return arr[index];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = sc.nextInt();

        if (n == 0) {
            System.out.println("Empty array");
            return;
        }

        try {
            System.out.println(getElement(arr, index));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }
}