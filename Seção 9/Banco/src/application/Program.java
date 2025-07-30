package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder name: ");
        String holderName = sc.nextLine();

        System.out.print("Will there be an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        BankAccount account;

        if (response == 'y') {
            System.out.print("Enter initial deposit amount: ");
            double initialDeposit = sc.nextDouble();
            account = new BankAccount(accountNumber, holderName, initialDeposit);
        } else {
            account = new BankAccount(accountNumber, holderName);
        }

        System.out.println("\nAccount data:");
        System.out.println(account);

        System.out.print("\nEnter a deposit amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.print("\nEnter a withdraw amount: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    }
}
