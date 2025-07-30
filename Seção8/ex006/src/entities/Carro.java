package entities;

public class Carro {

    public String marca;
    public String modelo;
    public int ano;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public void exibirInformaçoes(){
        System.out.println("CARRO: "+ marca + " " + modelo + " (" + ano + ")");
    }

}
