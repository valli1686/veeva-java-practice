import java.util.Scanner;

public class StringRotationCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        if (a.length() == b.length() && (a + a).contains(b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}