package application;

import utilities.Count;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, nmenores;
        double sum, altura_Media,porcetagem_Menores;

        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();
        Count[] vect = new Count[n];
        sc.nextLine();

        for (int i = 0; i<n; i++){
            System.out.println("Dados da "+ (i+1) +" pessoa: ");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            vect[i] = new Count(name,idade,altura);
        }

        sum = 0.0;
        for (int i = 0; i<n; i++){
            sum += vect[i].getAltura();
        }
        altura_Media = sum / n;

         nmenores = 0;
        for (int i = 0; i<n; i++){
            if( vect[i].getIdade() <16){
                nmenores++;
            }
        }
        porcetagem_Menores = ((double)nmenores / n) * 100.0;


        System.out.printf("Altura Media: %.2f", altura_Media);
        System.out.println("\nPessoas com menos de 16 anos: "+ porcetagem_Menores + "%");


        for (int i = 0; i<n; i++){
            if( vect[i].getIdade() <16){
                System.out.println(vect[i].getName());
            }
        }
        sc.close();
    }
}