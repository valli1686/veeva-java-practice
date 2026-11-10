import java.util.Scanner;

public class SafeDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());

            if (b == 0) {
                throw new ArithmeticException();
            }

            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input");
        }
    }
}