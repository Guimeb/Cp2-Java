package models;

public class Caminhao extends Veiculos {
    private double cargaAtual;
    private double cargaMaxima;

    public Caminhao(String marca, String modelo, int ano) {
        super(marca, modelo, ano, 100); // Velocidade máxima do caminhão é 100 km/h
        this.cargaAtual = 0; 
        this.cargaMaxima = 1000.0; // Carga máxima em Quilogramas
    } 

    public void obterStatus() { //Sobreposição do método obterStatus por subclasse adicionando carga para caminhão
        super.obterStatus();
        System.out.println("Carga atual do veiculo: " + cargaAtual + " kilo(s)");
        System.out.println("Carga maxima do veiculo: " + cargaMaxima + " kilo(s)");
        System.out.println("---------------------------------------------");
    }

    public void carregarCaminhao(double carga) {
        System.out.println("Tentando carregar o caminhao...");
        if (carga <= 0) { //Verifica se a carga é invalida ou nao
            System.out.println("O caminhao nao foi carregado, adicione um valor a quanto deseja carregar em quilogramas(Kg)");
            System.out.println("(O valor nao pode ser 0 ou negativo)");
        } else {
            if (cargaAtual + carga <= cargaMaxima) { //Verifica se a carga ultrapassa a carga maxima
                cargaAtual += carga;
                System.out.println("O caminhao foi carregado com: " + carga + " kilo(s)");
            } else if (cargaAtual + carga > cargaMaxima) {
                System.out.println("O caminhao nao foi carregado, pois a carga excede a capacidade maxima");
            }
        }
        System.out.println("---------------------------------------------");
    }

    public void descarregarCaminhao(double carga) {
        System.out.println("Tentando descarregar o caminhao...");
        if (carga <= 0) { //Verifica se a carga é invalida ou nao
            System.out.println("O caminhao nao foi descarregado, adicione um valor a quanto deseja descarregar em quilogramas(Kg)");
            System.out.println("(O valor nao pode ser 0 ou negativo)");
        } else {
            if (cargaAtual - carga >= 0) { //Verifica se a carga ultrapassa 0
                cargaAtual -= carga;
                System.out.println("Foi descarregado do caminhao: " + carga + " kilo(s)");
            } else {
                System.out.println("O valor a ser descarregado nao condiz com a carga atual");
            }
        }
        System.out.println("---------------------------------------------");
    }

}