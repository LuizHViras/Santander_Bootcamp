 /* Crie um Set e execute as seguintes operações:

        * Adicione 5 números inteiros: 3, 88, 20, 44, 3;
        * Navegue no Set exibindo cada número no console;
        * Remova o primeiro item do Set;
        * Adicione um novo número no Set: 23;
        * Verífique o tamanho do Set;
        * Verifique se o Set está vazio.*/

package one.innovation.digital.streamecollection.set.exercicio;

 import java.util.Iterator;
 import java.util.LinkedHashSet;
 import java.util.Set;
 import java.util.HashSet;
 import java.util.TreeSet;

 public class ExercicioSet {

    public static void main(String[] args) {

// Exercício com HashSet
        //Instancia a hashset nota
        Set<Integer> numeros = new HashSet<>();

        // Adiciona os números ao set
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        //Navega em todos os itens do Interator
        Iterator<Integer> iteratorHS = numeros.iterator();

        while(iteratorHS.hasNext()) {
            System.out.println(">" + iteratorHS.next());
        }

        // Remove o primeiro elemento
        numeros.remove(3);
        System.out.println(numeros);

        // Adiciona um novo valor ao set
        numeros.add(23);
        System.out.println(numeros);

        // Retorna o tamanho do set
        System.out.println(numeros.size());

        // Verifica se o set está vazio
        if (numeros.isEmpty()== true) {
            System.out.println("O set está vazio.");
        }
        else
            System.out.println("O set não está vazio.");

// Exercício com LinkedHashSet
        // Instancia o linkedhashset sequencianumerica
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        // Adiciona os números ao set
        sequenciaNumerica.add(3);
        sequenciaNumerica.add(88);
        sequenciaNumerica.add(20);
        sequenciaNumerica.add(44);
        sequenciaNumerica.add(3);

        //Navega em todos os itens do Interator
        Iterator<Integer> iteratorLHS = sequenciaNumerica.iterator();

        while(iteratorLHS.hasNext()) {
            System.out.println("->" + iteratorLHS.next());
        }

        // Remove o primeiro elemento
        sequenciaNumerica.remove(3);
        System.out.println(sequenciaNumerica);

        // Adiciona um novo valor ao set
        sequenciaNumerica.add(23);
        System.out.println(sequenciaNumerica);

        // Retorna o tamanho do set
        System.out.println(sequenciaNumerica.size());

        // Verifica se o set está vazio
        if (sequenciaNumerica.isEmpty()== true) {
            System.out.println("O set está vazio.");
        }
        else
            System.out.println("O set não está vazio.");

// Exercício com TreeSet
        // Instancia a treeset treeNumeros
        TreeSet<Integer> treeNumeros = new TreeSet<>();

        // Adiciona os números ao set
        treeNumeros.add(3);
        treeNumeros.add(88);
        treeNumeros.add(20);
        treeNumeros.add(44);
        treeNumeros.add(3);

        //Navega em todos os itens do Interator
        Iterator<Integer> iteratorTS = treeNumeros.iterator();

        while(iteratorTS.hasNext()) {
            System.out.println("-->" + iteratorTS.next());
        }

        // Remove o primeiro elemento
        treeNumeros.remove(3);
        System.out.println(treeNumeros);

        // Adiciona um novo valor ao set
        treeNumeros.add(23);
        System.out.println(treeNumeros);

        // Retorna o tamanho do set
        System.out.println(treeNumeros.size());

        // Verifica se o set está vazio
        if (treeNumeros.isEmpty()== true) {
            System.out.println("O set está vazio.");
        }
        else
            System.out.println("O set não está vazio.");
    }
}
