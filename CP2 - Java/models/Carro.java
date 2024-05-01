package models;

public class Carro extends Veiculos {
    private boolean arCondicionado;

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano, 180); // Velocidade máxima do carro é 180 km/h
        this.arCondicionado = false; // Ar condicionado inicialmente desligado
    }

    public void obterStatus() { //Sobreposição do método obterStatus por subclasse adicionando ar condicionado para carro
        super.obterStatus();
        System.out.println("Ar Condicionado: " + arCondicionado);
        System.out.println("---------------------------------------------");
    }

    public void ligarArCondicionado() { 
        System.out.println("Ligando o ar condicionado...");
        if (arCondicionado == true) {
            System.out.println("Ar Condicionado ja esta ligado!");
        } else {
            this.arCondicionado = true;
        }
        System.out.println("---------------------------------------------");
    }

    public void desligarArCondicionado() {
        System.out.println("Desligando o ar condicionado...");
        if (arCondicionado == false) {
            System.out.println("Ar Condicionado ja esta desligado!");
        } else {
            this.arCondicionado = false;
        }
        System.out.println("---------------------------------------------");
    }

}