import oop.Veiculos;
import oop.Carro;
import oop.Moto;
import oop.Caminhao;

public class Main {
    public static void main(String[] args) {

         Carro carro = new Carro("Toyota", "Corolla", 2020);
         carro.acelerar(200); // Acelerando o carro em 100 km/h
         carro.obterStatus(); // Mostrando status do carro após aceleração
 
         carro.desligarArCondicionado();
         carro.obterStatus(); // Mostrando status atualizado com ar condicionado ligado
 
         // Criando uma moto
         Moto moto = new Moto("Honda", "CBR", 2022);
         moto.acelerar(30); // Acelerando a moto em 30 km/h
         moto.obterStatus(); // Mostrando status da moto
 
         // Tentando empinar a moto
         moto.empinarMoto(); // Verificando se a moto pode ser empinada
 
         // Criando um caminhão
         Caminhao caminhao = new Caminhao("Volvo", "FH", 2018);
         caminhao.acelerar(80); // Acelerando o caminhão em 80 km/h
         caminhao.obterStatus(); // Mostrando status do caminhão
    }
}