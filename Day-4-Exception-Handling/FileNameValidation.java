import java.util.Scanner;

class InvalidFileNameException extends Exception {
    InvalidFileNameException() {
        super("Invalid File Name");
    }
}

public class FileNameValidation {

    static void validateFileName(String name)
            throws InvalidFileNameException {

        if (name.trim().isEmpty() ||
            name.contains("/") ||
            name.contains("\\")) {

            throw new InvalidFileNameException();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        try {
            validateFileName(name);
            System.out.println("Valid File Name");

        } catch (InvalidFileNameException e) {
            System.out.println(e.getMessage());
        }
    }
}