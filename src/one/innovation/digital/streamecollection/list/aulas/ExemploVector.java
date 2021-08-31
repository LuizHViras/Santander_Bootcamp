package one.innovation.digital.streamecollection.list.aulas;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        //Adiciona 4 esportes ao vetor
        esportes.add("Futebol");
        esportes.add("Basquete");
        esportes.add("Handbol");
        esportes.add("Ping Pong");

        // Altera o valor da posição 2 do vetor
        esportes.set(2, "Basquetebol");

        //Remove o esporte da posição 2
        esportes.remove(2);

        // Remove o esporte Handbol do vetor
        esportes.remove("Handbol");

        // Retorna o primeiro iem do vetor
        System.out.println(esportes.get(0));

        // Navega nos esportes
        for(String esporte: esportes) {
            System.out.println(esportes);
        }
    }
}
