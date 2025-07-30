import java.util.Scanner;


public class Cardapio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Código      Especificação         Preço");
		System.out.println("1          Cachorro Quente        R$4.00");
		System.out.println("2             X-Salada            R$4.50");
		System.out.println("3             X-Bacon             R$5.00");
		System.out.println("4          Torrada simples        R$2.00");
		System.out.println("5           Refrigerante          R$1.50\n");
		
		System.out.println("Digite o código do produto ao qual deseja solicitar:");
		int c1 = sc.nextInt();
		System.out.println("\nDigite a quantidade do produto o qual solicitou: ");
		int q1 = sc.nextInt();
		
		double valor = 0.0;

		switch (c1) {
		    case 1:
		        valor = q1 * 4.0;
		        break;
		    case 2:
		        valor = q1 * 4.5;
		        break;
		    case 3:
		        valor = q1 * 5.0;
		        break;
		    case 4:
		        valor = q1 * 2.0;
		        break;
		    case 5:
		        valor = q1 * 1.5;
		        break;
		    default:
		        System.out.println("Código inválido.");
		        sc.close();
		        return;
		}

		System.out.printf("Preço final ficou de: R$ %.2f%n", valor);
		sc.close();
	}

}