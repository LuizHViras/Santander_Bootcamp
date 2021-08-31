package one.innovation.digital.streamecollection.comparators.exercicio;

import one.innovation.digital.streamecollection.comparators.aulas.Estudante;

public class Pessoa implements Comparable<Pessoa> {

    private final String nome;
    private final Integer idade;

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {return nome;}

    public Integer getIdade() {return idade;}

    @Override
    public String toString() {return nome + "--" + idade; }

    @Override
    public int compareTo(Pessoa o) {return this.getIdade() - o.getIdade();}
}
