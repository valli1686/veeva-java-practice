import java.util.Scanner;

@FunctionalInterface
interface StringTest {
    boolean test(String s);
}

public class StringValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        StringTest validator = str ->
            str.matches(".*[A-Z].*") &&
            str.matches(".*\\d.*");

        if (validator.test(s)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}