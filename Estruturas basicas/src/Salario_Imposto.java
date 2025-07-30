import java.util.Scanner;

public class Salario_Imposto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salario para descobrir quanto você deve pagar de impostos: ")
        double salario = sc.nextDouble();
        double salario_impostos;

        if (salario >= 0.0 && salario <= 2000.0) {
            System.out.println("Você está isento de impostos");
        } else if (salario > 2000.0 && salario <= 3000.0) {
            salario_impostos = (salario-2000.0) * 0.08;
            System.out.printf("Você deve pagar R$: %.2f\n", salario_impostos);
        } else if (salario > 3000.0 && salario <= 4500.0) {
            salario_impostos = (salario-2000.0) * 0.18;
            System.out.printf("Você deve pagar R$: %.2f\n", salario_impostos);
        } else {
            salario_impostos = (salario-2000.0) * 0.28;
            System.out.printf("Você deve pagar R$: %.2f\n", salario_impostos);
        }
    }
}