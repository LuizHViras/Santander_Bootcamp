package one.innovation.digital.streamecollection.set.aulas;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) {

        // Instancia o set noas Alunos
        Set<Double> notasAlunos = new HashSet<>();

        // Adicional as notas no set
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        System.out.println(notasAlunos);

        // Remove a nota do set
        notasAlunos.remove(3.8);
        System.out.println(notasAlunos);

        // Retorna a quantidade de itens do se
        System.out.println(notasAlunos.size());

        //Navega em todos os itens do Interator
        Iterator<Double> iterator = notasAlunos.iterator();

        while(iterator.hasNext()) {
            System.out.println(">" + iterator.next());
        }

        for (Double nota: notasAlunos) {
            System.out.println("->" + nota);
        }

        notasAlunos.clear();
        System.out.println(notasAlunos.isEmpty());


    }
}
