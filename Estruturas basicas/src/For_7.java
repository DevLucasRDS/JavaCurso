import java.util.Scanner;
public class For_7 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro para calcular seus divisores: ");
        int n1 = sc.nextInt();

        for(int i = 1; i<=n1; i++){
            if(n1%i == 0){
                System.out.println(i);
            }
        }
    }
}
