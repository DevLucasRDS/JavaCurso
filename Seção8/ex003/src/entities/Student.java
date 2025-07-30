package entities;

public class Student {
    public String Name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double somasNotas() {
         return nota1 + nota2 + nota3;
    }
}
