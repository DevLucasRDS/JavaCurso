package application;

import entities.Carro;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o modelo do carro: ");
        String modelo = sc.nextLine();
        System.out.print("Digite a marca do carro: ");
        String marca = sc.nextLine();
        System.out.print("Digite o ano do carro: ");
        int ano = sc.nextInt();

        Carro car = new Carro(modelo,marca,ano);

        car.exibirInformaçoes();
    }
}