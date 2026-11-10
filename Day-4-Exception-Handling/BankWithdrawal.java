import java.util.Scanner;

class InsufficientFundsException extends Exception {
    InsufficientFundsException() {
        super("Insufficient funds");
    }
}

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException();
        }

        balance -= amount;
    }
}

public class BankWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = sc.nextDouble();
        double amount = sc.nextDouble();

        BankAccount account = new BankAccount(balance);

        try {
            account.withdraw(amount);
            System.out.printf("%.2f%n", account.balance);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}