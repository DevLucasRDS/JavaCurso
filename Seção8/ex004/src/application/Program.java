package application;

import utility.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    //FINAL é para indicar uma constancia, uma vez atribuída, não pode ser mudada.
    //Padrão de nome para constâncias é tudo maiúsculo

    //Você não pode chamar um metodo não static em um dentro de um que é static.

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circuference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);
    }
}