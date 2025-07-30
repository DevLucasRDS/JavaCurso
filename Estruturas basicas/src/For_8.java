import java.util.Scanner;
public class For_8 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para elavo ao quadrado e ao cubo: ");
        int n1 = sc.nextInt();

        for(int i = 1; i<=n1; i++){
            System.out.println(i +" "+ Math.pow(i,2) + " " + Math.pow(i,3));
        }
    }
}
