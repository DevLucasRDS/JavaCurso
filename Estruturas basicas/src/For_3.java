import java.util.Scanner;
public class For_3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos valores serão lidos: ");
        int n1 = sc.nextInt();

        //Ler quantos valores estão no intervalo de 10 a 20

        int n2 = 0, in = 0 , out = 0;
        for(int i = 0; i<n1; i++){
            System.out.print("Digite um valor: ");
            n2 = sc.nextInt();
            if(n2>=10 && n2<=20){
              in +=1;
            }
            else {
                out += 1;
            }
        }
        System.out.println(in+ " IN\n" +out + " OUT");
    }
}
