package application;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você ira digitar? ");
        int n = sc.nextInt();
        sc.nextLine();
        double[] vect = new double[n];

        for (int i = 0; i<n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        double sum = 0.0;

        for(int i = 0; i<n; i++){
            sum += vect[i];
        }
        System.out.print("Valores: ");
        for (int i = 0; i<n; i++){
            System.out.print(vect[i] + " ");
        }
        System.out.println("\nSoma: "+ sum);
        System.out.println("Media: "+ sum/n);

        sc.close();


    }
}