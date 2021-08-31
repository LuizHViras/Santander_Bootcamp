/*Crie uma Lista de um objeto complexo e execute as seguintes operações:

    * Adicione elementos nesta lista;
    * Ordene implementando a interface java.util.Comparator no seu objeto complexo;
    * Ordene implementando um novo objeto com a interface java.uti.Comparable;
    * Ordene usando uma expressão lamda na chamada de sua lista.sort();
    * Ordene usando referências de métodos e os métodos estáticos de Comparator;
    * Ordene coleções TreeSet e TreeMap.*/

package one.innovation.digital.streamecollection.comparators.exercicio;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;


public class ExercicioComparator {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        // Adiciona elementos a lista
        pessoas.add(new Pessoa("Luiz", 21));
        pessoas.add(new Pessoa("Maria", 18));
        pessoas.add(new Pessoa("Vera", 54));
        pessoas.add(new Pessoa("Sergio", 62));

        System.out.println(pessoas);

        // Ordenar com o uso de comparator
        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade));
        System.out.println("Ordena de forma crescente as idades da lista");
        System.out.println(pessoas);

        // Adiciona um elemento e ordena com a interface Comparable
        pessoas.add(new Pessoa("Regiane", 27));
        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade).reversed());
        System.out.println("Ordena de forma decrescente as idades da lista");
        System.out.println(pessoas);

        // Ordene usando uma expressão lamda
        pessoas.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println("Ordena de forma crescente as idades da lista com lambda");
        System.out.println(pessoas);

        // Ordene usando referências de métodos e os métodos estáticos de Comparator
        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade).reversed());
        System.out.println("Ordena de forma decrescente as idades da lista com referência de métodos");
        System.out.println(pessoas);

        // Ordene coleções TreeSet e TreeMap
        NavigableSet<String> numerosTS = new TreeSet();

        numerosTS.add("3");
        numerosTS.add("2");
        numerosTS.add("1");
        numerosTS.add("5");
        numerosTS.add("4");

        System.out.println("TreeSet: " + numerosTS);

        NavigableMap<Integer, String> numerosTM = new TreeMap<>();

        numerosTM.put(5, "five");
        numerosTM.put(3, "three");
        numerosTM.put(2, "two");
        numerosTM.put(4, "four");
        numerosTM.put(1, "one");

        System.out.println("TreeMap: " + numerosTM);
    }
}