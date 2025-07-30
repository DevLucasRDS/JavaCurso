package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //Fazer um programa para ler os valores da largura e altura
        //de um retângulo. Em seguida, mostrar na tela o valor de
        //sua área, perímetro e diagonal. Usar uma classe como
        //mostrado no projeto ao lado.

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.widht = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("Area: %2f%"+ rectangle.area());
        System.out.println("Perimeter: "+ rectangle.perimeter());
        System.out.println("Diagonal: "+ rectangle.diagonal());
    }
}