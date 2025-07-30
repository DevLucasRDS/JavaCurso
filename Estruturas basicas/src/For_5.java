import java.util.Scanner;

public class For_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja fazer quantas divisões? ");
        int n1 = sc.nextInt();

        for (int i = 0; i < n1; i++) {
            System.out.print("Digite o primeiro número, o qual será dividido: ");
            double x1 = sc.nextDouble();

            System.out.print("Digite o segundo número, o qual será o divisor: ");
            double x2 = sc.nextDouble();

            if (x2 == 0) {
                System.out.println("Divisão impossível");
            } else {
                double div = x1 / x2;
                System.out.printf("Resultado: %.1f\n", div);
            }
        }
    }
}
