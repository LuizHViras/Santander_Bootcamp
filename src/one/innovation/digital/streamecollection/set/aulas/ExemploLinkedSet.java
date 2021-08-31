package one.innovation.digital.streamecollection.set.aulas;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        // Adiciona números no set
        sequenciaNumerica.add(16);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(1);

        System.out.println(sequenciaNumerica);

        //Remove o número do set
        sequenciaNumerica.remove(4);

        //Navega em todos os itens do Interator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while(iterator.hasNext()) {
            System.out.println(">" + iterator.next());
        }

        for (Integer numero: sequenciaNumerica) {
            System.out.println("->" + numero);
        }

        sequenciaNumerica.clear();
        System.out.println(sequenciaNumerica.isEmpty());
    }
}
