import java.util.Scanner;

class Account {
    private String accountNo;
    private double balance;

    Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    boolean deposit(double amount) {
        if (amount <= 0) return false;
        balance += amount;
        return true;
    }

    boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) return false;
        balance -= amount;
        return true;
    }

    double getBalance() {
        return balance;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double initialBalance = sc.nextDouble();
        int q = sc.nextInt();

        Account account = new Account("A101", initialBalance);

        for (int i = 0; i < q; i++) {
            char operation = sc.next().charAt(0);
            double amount = sc.nextDouble();

            boolean accepted = operation == 'D'
                    ? account.deposit(amount)
                    : account.withdraw(amount);

            if (accepted) {
                System.out.printf("%.2f%n", account.getBalance());
            } else {
                System.out.println("Invalid Transaction");
            }
        }

        sc.close();
    }
}