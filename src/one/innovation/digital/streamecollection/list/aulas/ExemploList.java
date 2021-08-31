package one.innovation.digital.streamecollection.list.aulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>(); // Instanciamos a Array List

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes); // Printa a lista

        nomes.set(2, "Larissa"); // Substitui a posição 2 para "Larissa"
        //System.out.println(nomes);

        Collections.sort(nomes); // Colocou em ordem alfabética

        nomes.remove(4); //Removeu o dado da posição 4

        nomes.remove("Carlos"); // Removeu o nome Carlos

        String nome = nomes.get(2); // Atribui o valor da posição 2 em nomes para a variável nome
        //System.out.println(nome);

        int tamanho = nomes.size(); // Atribui o tamanho da lisa nomes para a variavem tamanho
        //System.out.println(tamanho);

        boolean temFernando = nomes.contains("Fernando"); // Verifica se possui o nome Fernando na lista
        //System.out.println(temFernando);

        int posicao = nomes.indexOf("Carlos"); // Verifica a posição da nome setado, caso não possua ele retorna -1
        //System.out.println(posicao);

        for(String nomeItem: nomes) {
            System.out.println("--->"+nomeItem); // Printa todos os nomes da lista
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println("->"+iterator.next());
        }

        nomes.clear(); // Limpa a lista
        boolean listaEstaVazia = nomes.isEmpty(); // Verifica se a lista está vazia
        System.out.println(listaEstaVazia);
    }
}

