package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        //Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
        //(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
        //ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
        //para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
        //resolver este problema

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Student student = new Student();

        System.out.print("Nome: ");
        student.Name = sc.nextLine();
        System.out.println("Digites suas notas do simestres: ");
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        double notaFinal = student.somasNotas();
        System.out.printf("FINAL GRADE: %.2f", notaFinal);
        if (notaFinal>=60){
            System.out.println("\nPASS");
        }
        else{
            System.out.println("\nFAILED");
            System.out.printf("MISSING: %.2f", (60-notaFinal) , " Points");
        }

    }
}