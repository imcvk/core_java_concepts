package org.opps.accessmodifires.coding_challenge.com.example.bank;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1010", 500, "test");
        account.deposit(100);
        System.out.println(account.withdraw(100));
        account.deposit(-200);
        account.withdraw(0);
    }
}
