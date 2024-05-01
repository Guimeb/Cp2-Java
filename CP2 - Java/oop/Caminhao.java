package oop;

public class Caminhao extends Veiculos {
    private double cargaAtual;
    private double cargaMaxima;

    public Caminhao(String marca, String modelo, int ano) {
        super(marca, modelo, ano, 100); // Velocidade máxima do caminhão é 100 km/h
        this.cargaAtual = 0;
        this.cargaMaxima = 1000.0; // Carga máxima em toneladas
    } 

    @Override
    public void obterStatus() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Velocidade Máxima: " + getVelocidadeMaxima() + " km/h");
        System.out.println("Velocidade Atual: " + getVelocidadeAtual() + " km/h");
        System.out.println("Carga maxima do veiculo: " + cargaMaxima + "tonelada");
        System.out.println("---------------------------------------------");
    }

    //Getters and Setters
    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
}