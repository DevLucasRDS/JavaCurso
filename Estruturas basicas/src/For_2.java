import java.util.Scanner;
public class For_2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int x = sc.nextInt();

        for(int i = 0; i<x; i++){
            if(i%2 == 1){
                System.out.println(i);
            }
        }
    }
}
