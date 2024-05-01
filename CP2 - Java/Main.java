//Importando objetos
import oop.Carro;
import oop.Moto;
import oop.Caminhao;

public class Main {
    public static void main(String[] args) {

        //Criando um novo objeto carro
         Carro carro = new Carro("Toyota", "Corolla", 2020);
         carro.acelerar(100); // Acelerando o carro
         carro.obterStatus(); // Mostrando status do carro após aceleração
         //Desligando o ar condicionado
         carro.desligarArCondicionado(); //Para ligar "ligarArCondicionado()"
         carro.obterStatus(); // Mostrando status atualizado com ar condicionado ligado
 
         // Criando um novo objeto moto
         Moto moto = new Moto("Honda", "CBR", 2022);
         moto.acelerar(30); // Acelerando a moto
         moto.obterStatus(); // Mostrando status da moto
         // Tentando empinar a moto
         moto.empinarMoto(); // Verificando se a moto pode ser empinada
 
         // Criando um novo objeto caminhão
         Caminhao caminhao = new Caminhao("Volvo", "FH", 2018);
         caminhao.acelerar(80); // Acelerando o caminhão
         caminhao.obterStatus(); // Mostrando status do caminhão
    }
}