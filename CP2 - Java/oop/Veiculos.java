package oop;

public class Veiculos {

    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeMaxima;
    private int velocidadeAtual;

    public Veiculos(String marca, String modelo, int ano, int velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0; // Começa parado
    }

    public void acelerar(int incremento) {

        System.out.println("Tentando acelerar o veiculo");

        if (incremento <= 0) { //Verifica se o incremento na velocidade é invalido ou nao
            System.out.println("O veiculo nao foi acelerado, adicione um valor a quanto deseja acelerar em kilometros");
            System.out.println("(O valor nao pode ser 0 ou negativo)");
        } else {
            if (velocidadeAtual + incremento <= velocidadeMaxima) {
            velocidadeAtual += incremento;
            System.out.println("A velocidade foi aumentada em: " + incremento + "Km/h");
            } else {
            velocidadeAtual = velocidadeMaxima;
            System.out.println("O veiculo ja esta em velocidade maxima");
            }
        }
    }

    public void reduzirVelocidade(int decremento) {

        System.out.println("Tentando reduzir a velocidade do veiculo");
        
        if (decremento <= 0) { //Verifica se o incremento na velocidade é invalido ou nao
            System.out.println("O veiculo nao alterou a velocidade, adicione um valor a quanto deseja acelerar em kilometros");
            System.out.println("(O valor nao pode ser 0 ou negativo)");
        } else {
            if (velocidadeAtual - decremento >= 0) {
                velocidadeAtual -= decremento;
                System.out.println("A velocidade foi reduzida em: " + decremento + "Km/h");
            } else {
                velocidadeAtual = 0;
                System.out.println("O veiculo ja esta parado.");
            }
        }
    }

    public void obterStatus() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + " km/h");
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
        System.out.println("---------------------------------------------");
    }

    //Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

}
