import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int units = sc.nextInt();
        double bill;

        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 200) {
            bill = 100 * 1.5 + (units - 100) * 2.5;
        } else {
            bill = 100 * 1.5 + 100 * 2.5
                    + (units - 200) * 4;
        }

        bill += 50;

        System.out.printf("%.2f%n", bill);
    }
}