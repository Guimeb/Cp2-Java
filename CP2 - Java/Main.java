//Trabalho feito por Guilherme Morais - RM 551981
//Importando objetos
import models.Caminhao;
import models.Carro;
import models.Moto;

public class Main { //Metodo principal
    public static void main(String[] args) {

        System.out.println("-------- Objeto Carro -------");

        //Criando um novo objeto carro
         Carro carro = new Carro("Toyota", "Corolla", 2020);
         carro.obterStatus(); // Mostrando status do carro
         carro.acelerar(100); // Acelerando o carro
         carro.obterStatus(); // Mostrando status do carro após aceleração
         carro.reduzirVelocidade(100); // Acelerando o carro
         //Desligando o ar condicionado
         carro.ligarArCondicionado(); //Para ligar "ligarArCondicionado()"
         carro.obterStatus(); // Mostrando status atualizado com ar condicionado ligado

         System.out.println("-------- Objeto Moto -------");
 
         // Criando um novo objeto moto
         Moto moto = new Moto("Honda", "CBR", 2022);
         moto.obterStatus(); // Mostrando status da moto
         moto.acelerar(200); // Acelerando a moto
         moto.obterStatus(); // Mostrando status da moto apos aceleração
         // Tentando empinar a moto
         moto.empinarMoto(); // Verificando se a moto pode ser empinada
         moto.obterStatus(); // Mostrando status da moto apos aceleração
         moto.desempinarMoto();
         moto.obterStatus();

        System.out.println("-------- Objeto Caminhao -------");

         // Criando um novo objeto caminhão
         Caminhao caminhao = new Caminhao("Volvo", "FH", 2018);
         caminhao.obterStatus(); // Mostrando status do caminhão
         caminhao.carregarCaminhao(400);
         caminhao.obterStatus(); // Mostrando status do caminhão apos carregar
         caminhao.descarregarCaminhao(200);
         caminhao.obterStatus(); // Mostrando status do caminhão apos descarregar
    }
}