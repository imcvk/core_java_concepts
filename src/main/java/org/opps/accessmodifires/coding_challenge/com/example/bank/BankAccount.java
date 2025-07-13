package org.opps.accessmodifires.coding_challenge.com.example.bank;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount(String accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to " + accountHolderName);
        } else {
            System.out.println("Cannot deposit " + amount + " to " + accountHolderName);
        }
    }

    public double withdraw(double amount) {
        if (amount > balance) {
            balance -= amount;
        } else if (amount <= 0) {
            System.out.println("Cannot withdraw " + amount + " from " + accountHolderName);
        } else {
            balance = amount;
            balance = 0;
        }
        return balance;
    }
}
