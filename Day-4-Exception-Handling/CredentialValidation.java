import java.util.Scanner;

class UsernameTooShortException extends Exception {
    UsernameTooShortException() {
        super("Username too short");
    }
}

class PasswordTooShortException extends Exception {
    PasswordTooShortException() {
        super("Password too short");
    }
}

class WeakPasswordException extends Exception {
    WeakPasswordException() {
        super("Weak password");
    }
}

public class CredentialValidation {

    static void validate(String username, String password)
            throws UsernameTooShortException,
                   PasswordTooShortException,
                   WeakPasswordException {

        if (username.length() < 5) {
            throw new UsernameTooShortException();
        }

        if (password.length() < 8) {
            throw new PasswordTooShortException();
        }

        if (!password.matches(".*\\d.*")) {
            throw new WeakPasswordException();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = sc.next();
        String password = sc.next();

        try {
            validate(username, password);
            System.out.println("Valid Credentials");

        } catch (UsernameTooShortException |
                 PasswordTooShortException |
                 WeakPasswordException e) {

            System.out.println(e.getMessage());
        }
    }
}