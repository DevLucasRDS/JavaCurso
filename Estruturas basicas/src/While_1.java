import java.util.Scanner;
public class While_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua Senha: ");
        int leitor = sc.nextInt();

        while(leitor!= 2002){
            System.out.println("Senha incorreta, digite novamente: ");
            leitor = sc.nextInt();
        }
        System.out.println("Acesso permitido");
    }
}