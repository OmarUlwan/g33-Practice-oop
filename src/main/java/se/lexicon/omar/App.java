package se.lexicon.omar;

import se.lexicon.omar.model.BankAccount;

public class App {

    public static void main(String[] args) {

        // Create two objects of BankAccount.
        BankAccount simon = new BankAccount(9153, 15300, "Simon Elbrink", "simon@gmail.com", 731111111);
        BankAccount omar = new BankAccount(9331, 9533, "Omar Ulwan", "omar@gmail.com", 731111133);

        // Get Balance.
        System.out.println("Old balance: " + simon.getBalance());

        // Deposit funds and print the account info.
        simon.deposit(3000);
        simon.getPrint();

        // Get Balance.
        System.out.println("Old balance: " + omar.getBalance());

        // Deposit funds and print the account info.
        omar.deposit(1000);
        omar.getPrint();

        // Get Balance.
        System.out.println("Old balance: " + simon.getBalance());

        // Withdraw funds and print the account info.
        simon.withdraw(7000);
        simon.getPrint();

        // Get Balance.
        System.out.println("Old balance: " + omar.getBalance());

        // Withdraw funds and print the account info.
        omar.withdraw(20000);
        omar.getPrint();

    }
}
