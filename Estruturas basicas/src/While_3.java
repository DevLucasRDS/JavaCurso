import java.util.Scanner;
public class While_3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Codigo       Tipo de combustível\n1                 Alcool\n2                 Gasolina\n3                 Diesel\n4                 FIM");
        System.out.println("Qual combustível o cliente pediu? ");
        int p1 = sc.nextInt();
        int gasolina = 0, diesel = 0, alcool = 0;

        while(p1 != 4){
            if(p1 == 1){
                alcool+= 1;
            }
            else if(p1 == 2){
                gasolina+=1;
            }
            else if (p1 == 3){
                diesel+=1;
            }
            else{
                System.out.println("Digite novamente: ");
            }
            System.out.println("Qual combustível o cliente pediu? ");
            p1 = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO\nAlcool: "+alcool + "\nGasolina: "+gasolina+"\nDiesel: "+diesel);
    }
}
