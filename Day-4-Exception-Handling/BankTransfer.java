import java.util.Scanner;

class InvalidAmountException extends Exception {
    InvalidAmountException() {
        super("Invalid amount");
    }
}

class InsufficientFundsException extends Exception {
    InsufficientFundsException() {
        super("Insufficient funds");
    }
}

class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }
}

public class BankTransfer {

    static void transfer(Account source, Account destination,
                         double amount)
            throws InvalidAmountException,
                   InsufficientFundsException {

        if (amount <= 0) {
            throw new InvalidAmountException();
        }

        if (source.balance < amount) {
            throw new InsufficientFundsException();
        }

        double newSource = source.balance - amount;
        double newDestination = destination.balance + amount;

        if (newSource < 0 || newDestination < 0) {
            throw new InvalidAmountException();
        }

        source.balance = newSource;
        destination.balance = newDestination;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sourceBalance = sc.nextDouble();
        double destinationBalance = sc.nextDouble();
        double amount = sc.nextDouble();

        Account source = new Account(sourceBalance);
        Account destination = new Account(destinationBalance);

        try {
            transfer(source, destination, amount);

            System.out.printf("Source: %.2f%n", source.balance);
            System.out.printf("Destination: %.2f%n",
                    destination.balance);

        } catch (InvalidAmountException |
                 InsufficientFundsException e) {

            System.out.println(e.getMessage());
        }
    }
}