package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for(int i =0; i< vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }
        double sum = 0.0;

        for (int i = 0; i<n; i++){
            //pegar somente o preço do objeto
            sum += vect[i].getPrice();
        }
        double avg = sum/n;
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);
    }
}