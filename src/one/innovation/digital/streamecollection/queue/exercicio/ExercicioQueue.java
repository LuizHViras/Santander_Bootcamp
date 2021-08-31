/*Crie uma fila e execute as seguintes operações:

    * Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João;
    * Navegue na fila exibindo cada nome no console;
    * Retorne o primeiro item da fila, sem removê-lo;
    * Retorne o primeiro item da fila, removendo o mesmo;
    * Adicione um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila;
    * Retorne o tamanho da lista;
    * Verifique se a lista está vazia;
    * Verifique se o nome Carlos está na lista.*/

package one.innovation.digital.streamecollection.queue.exercicio;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>(); // Instancia a Queue fila do tipo String

        fila.add("Juliana"); // adiciona nomes a queue
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");

        for (String client: fila) { // Apresenta todos os dados da queue por linha
            System.out.println("->" + client);
        }

        String primeiroCliente = fila.peek(); // Apresenta o primeiro cliente sem remove-lo e retorna nulo caso ele não exista
        System.out.println("\n" + primeiroCliente);
        System.out.println(fila);

        primeiroCliente = null;

        primeiroCliente = fila.poll(); // Apresenta o primeiro cliente e o remove
        System.out.println("\n" + primeiroCliente);
        System.out.println(fila);

        fila.add("Daniel");
        System.out.println("\n" + fila);

        if (fila.isEmpty() == true) { // Verifica se a fila está vazia
            System.out.println("\nA fila está vazia");
        }
        else
            System.out.println("\nA fila não está vazia");

        boolean temCarlos = fila.contains("Carlos"); // Verifica se tem o nome Carlos na Lista
        if ((temCarlos == true)) {
            System.out.println("\nSim, tem Carlos na Lista");
        } else {
            System.out.println("\nNão, não tem Carlos na Lista");
        }
    }
}
