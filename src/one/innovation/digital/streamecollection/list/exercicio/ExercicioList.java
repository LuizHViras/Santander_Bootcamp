/*Crie uma lista e execute as seguintes operações:

        * Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João;
        * Navegue na lista exibindo cada nome no console;
        * Substitua o nome Carlos por Roberto;
        * Retorne o nome da posição 1;
        * Remova o nome da posição 4;
        * Remova o nome João;
        * Retorne a quantidade de itens na lista;
        * Verifique se o nome Juliano existe na lista;
        * Crie uma nova lista com os nomes: Ismael e Rodrigo. Adicione todos os itens da nova lista na primeira lista criada;
        * Ordene o itens da lista por ordem alfabética;
        * Verifique se a lista está vazia.*/

package one.innovation.digital.streamecollection.list.exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>(); // Instanciada lista nomes

        nomes.add("Juliana"); // Adicionados nomes a lista
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("Joao");
        System.out.println(nomes);

        for(String nome: nomes){
            System.out.println("->" + nome);
        }

        nomes.set(2, "Roberto"); // Substitui o nome Carlos pelo Roberto
        System.out.println(nomes);

        String nome = nomes.get(0); // Atribui a variavel nome o valor da posição da listaa nomes
        System.out.println(nome);

        nomes.remove(3); // Remove o nome da posição 4
        System.out.println(nomes);

        nomes.remove("Joao"); // Remove o nome João
        System.out.println(nomes);

        int tamanho = nomes.size(); // Atribui a variavel tamanho o tamanho da Lista nomes
        System.out.println("Tamanho da list: " +tamanho);

        boolean temJuliano = nomes.contains("Juliano"); // Verifica se tem o nome Juliano na Lista
        if ((temJuliano == true)) {
            System.out.println("Sim, tem Juliano na Lista");
        } else {
            System.out.println("Não, não tem Juliano na Lista");
        }

        List<String> ismaelERodrigo = new ArrayList<>(); // Instancia nova Lista com nome ismaelERodrigo

        ismaelERodrigo.add("Ismael");
        ismaelERodrigo.add("Rodrigo");

        nomes.add(0, ismaelERodrigo.get(0)); // Adiciona os nomes da lista ismaelERodrigo em nomes
        nomes.add(1, ismaelERodrigo.get(1));
        System.out.println(nomes);

        Collections.sort(nomes); // Ordena alfabeticamente a lista nomes
        System.out.println(nomes);

        boolean listaEstaVazia = nomes.isEmpty(); // Verifica se a lista nomes está vazia
        if(listaEstaVazia == false) {
            System.out.println("A Lista não está vazia");
        } else
        System.out.println("A Lista está vazia");

    }
}
