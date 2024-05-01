package models;

public class Moto extends Veiculos {
    private boolean empinada;

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano, 120); // Velocidade máxima da moto é 120 km/h
        this.empinada = false; // Moto inicialmente não está empinada
    }

    public void obterStatus() { //Sobreposição do método obterStatus por subclasse
        super.obterStatus();
        System.out.println("Moto empinada: " + empinada);
        System.out.println("---------------------------------------------");
    }

    public void empinarMoto() { //Método para empinar a moto
        System.out.println("Tentando empinar a moto...");
        if (empinada == true) {
            System.out.println("Moto já está empinada!");
            return;
            
        }else{
            if (getVelocidadeAtual() > 20 && getVelocidadeAtual() < 50) {
                this.empinada = true;
                System.out.println("Moto empinada!");
            } else {
                System.out.println("Velocidade inadequada para empinar a moto.");
            }
            System.out.println("---------------------------------------------");
        }
    }

    public void desempinarMoto() { //Método para desempinar a moto
        System.out.println("Tentando desempinar a moto...");
        if (empinada == true && getVelocidadeAtual() > 50) { //Nao afetara velocidade da moto, ocorrera apenas caso tente acelerar ao estar empinada
            System.out.println("Velocidade acima de 50 km/h, ao tentar desempinar a moto, voce caiu!");
        } else {
            if (empinada == false) {
                System.out.println("Moto já está desempinada!");
                return;
            } else {
                this.empinada = false;
                System.out.println("Moto desempinada!");
                System.out.println("---------------------------------------------");
            }
        }
    }
}