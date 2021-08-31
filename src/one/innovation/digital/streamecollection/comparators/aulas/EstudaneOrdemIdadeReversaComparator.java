package one.innovation.digital.streamecollection.comparators.aulas;

import java.util.Comparator;

public class EstudaneOrdemIdadeReversaComparator implements Comparator<Estudante> {

    @Override
    public int compare(Estudante o1, Estudante o2) {
        return o2.getIdade() - o1.getIdade();
    }
}
