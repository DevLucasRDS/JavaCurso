import java.util.Scanner;
public class For_4 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja fazer quantas médias ponderadas? ");
        int qnt = sc.nextInt();
        double m1, m2, m3, mediaFinal;

        for(int i = 0; i<qnt; i++){
            System.out.print("Digite o valor da primeira média: ");
            m1 = sc.nextDouble();

            System.out.print("Digite o valor da Segunda média: ");
            m2 = sc.nextDouble();

            System.out.print("Digite o valor da terceira média: ");
            m3 = sc.nextDouble();

            mediaFinal = ( m1 * 2 + m2 * 3 + m3 * 5)/10;
            System.out.printf("Sua média final é: %.1f\n", mediaFinal);
        }
    }
}
