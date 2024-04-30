package oop;

public class Carro extends Veiculos {
    private boolean arCondicionado;

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano, 180); // Velocidade máxima do carro é 180 km/h
        this.arCondicionado = true; // Ar condicionado inicialmente desligado
    }

    @Override
    public void obterStatus() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Velocidade Máxima: " + getVelocidadeMaxima() + " km/h");
        System.out.println("Velocidade Atual: " + getVelocidadeAtual() + " km/h");
        System.out.println("Ar Condicionado: " + arCondicionado);
        System.out.println("---------------------------------------------");
    }
    

    public void ligarArCondicionado() {
        this.arCondicionado = true;
    }

    public void desligarArCondicionado() {
        this.arCondicionado = false;
    }

}