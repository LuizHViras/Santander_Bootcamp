package one.innovation.digital.streamecollection.queue.aulas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>(); // Instancia a nova queue que garante a ordem de inserção sem garantir metodos de mudança

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll(); // Atribui o valor 0 de filaBanco para clienteASerAtendido e remove de filaBanco
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        filaBanco.clear(); // Esvazia a queue

        String primeiroCliente = filaBanco.peek(); // Não remove o primeiro elemento de filaBanco e retorna nulo caso não tenha ninguém
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        String primeiroClienteOuErro = filaBanco.element(); // O mesmo que o .peek mas retorna uum erro caso não tenha ninguém na fila
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        for (String client: filaBanco) { // Apresenta todos os dados da queue por linha
            System.out.println(client);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()) { // Apresenta todos os dados da queue
            System.out.println("->"+iteratorFilaBanco);
        }

        System.out.println(filaBanco.size()); // Retorna o tamanho da queue
        System.out.println(filaBanco.isEmpty()); // Verifica se a queue esá vazia
    }
}
