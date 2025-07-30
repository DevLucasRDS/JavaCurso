import java.util.Scanner;
public class For_1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas numeros você quer somar? ");
        int n = sc.nextInt();

        int soma = 0;
        for(int i = 0;i<n; i++ ){
            System.out.println("Digite um numero: ");
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println(soma);
    }
}
