import java.util.Scanner;
public class While_2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor X do plano cartesiano");
        int x = sc.nextInt();
        System.out.println("Digite o valor Y do plano cartesiano");
        int y = sc.nextInt();

        while( x != 0 && y != 0 ){
            if(x > 0 && y > 0){
                System.out.println("Primeiro quadrante");
            }
            else if(x<0 && y<0){
                System.out.printf("Terceiro quadrante");
            }
            else if(x>0 && y<0){
                System.out.println("Quarto quadrante");
            }
            else{
                System.out.println("Segundo quadrante");
            }
            System.out.println("\nDigite o valor X do plano cartesiano");
            x = sc.nextInt();
            System.out.println("Digite o valor Y do plano cartesiano");
            y = sc.nextInt();
        }
    }
}
