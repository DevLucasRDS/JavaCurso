package application;

import utility.CurrencyCoverter;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollar_price = sc.nextDouble();
        System.out.print("how many dollars will be bought? ");
        double dollar_buy = sc.nextDouble();

        double price_final = CurrencyCoverter.coverter(dollar_buy,dollar_price);

        System.out.printf("Amount to be paid in reais = %.2f%n", price_final);
    }
}