package oop;

public class Moto extends Veiculos {
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano, 120); // Velocidade máxima da moto é 120 km/h
    }

    public void empinarMoto() {
        System.out.println("Tentando empinar a moto...");
        if (getVelocidadeAtual() > 20 && getVelocidadeAtual() < 50) {
            System.out.println("Moto empinada!");
        } else {
            System.out.println("Velocidade inadequada para empinar a moto.");
        }
        System.out.println("---------------------------------------------");
    }
    
}