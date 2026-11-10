import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException() {
        super("Invalid age");
    }
}

public class AgeValidation {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 100) {
            throw new InvalidAgeException();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        try {
            validateAge(age);
            System.out.println("Eligible");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}