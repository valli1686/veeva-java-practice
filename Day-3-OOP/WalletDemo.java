import java.util.Scanner;

class Wallet {
    private double balance;

    Wallet(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount");
        } else {
            balance += amount;
            System.out.printf("%.2f%n", balance);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.printf("%.2f%n", balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class WalletDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double initialBalance = sc.nextDouble();
        int q = sc.nextInt();

        Wallet wallet = new Wallet(initialBalance);

        for (int i = 0; i < q; i++) {
            String operation = sc.next();
            double amount = sc.nextDouble();

            if (operation.equals("D")) {
                wallet.deposit(amount);
            } else if (operation.equals("W")) {
                wallet.withdraw(amount);
            }
        }
    }
}