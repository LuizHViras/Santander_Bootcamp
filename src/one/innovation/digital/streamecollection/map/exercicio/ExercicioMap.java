/* Crie um Map e execute as seguintes operações:

        * Adicione os 26 estados brasileiros no map, onde a sigla será a chave e o nome do estado o valor;
        * Remova o estado de Minas Gerais;
        * Adicione o Distrito Federal;
        * Verifique o tamanho do mapa;
        * Remova o estado de Mato Grosso do Sul usando o nome;
        * Navegue em todos os registros do map, mostrando no console no seguinte formato: NOME (SIGLA);
        * Verifique se o estado de Santa Catarina existe no map buscando por sua sigla (SC);
        * Verifique se o estado de Maranhão existe no map buscando por seu nome.*/

package one.innovation.digital.streamecollection.map.exercicio;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class ExercicioMap {

        public static void main(String[] args) {

                // Exercício com HashTable
                Hashtable<String, String> estadosHT = new Hashtable<>();

                // Adiciona os 26 estados brasileiros e suas respectivas siglas
                estadosHT.put("AC", "Acre");
                estadosHT.put("AL", "Alagoas");
                estadosHT.put("AM", "Amazonas");
                estadosHT.put("AP", "Amapa");
                estadosHT.put("BA", "Bahia");
                estadosHT.put("CE", "Ceara");
                estadosHT.put("ES", "Espirito Santo");
                estadosHT.put("GO", "Goias");
                estadosHT.put("MA", "Maranhao");
                estadosHT.put("MT", "Mato Grosso");
                estadosHT.put("MS", "Mato Grosso do Sul");
                estadosHT.put("MG", "Minas Gerais");
                estadosHT.put("PB", "Paraiba");
                estadosHT.put("PA", "Para");
                estadosHT.put("PR", "Paraná");
                estadosHT.put("PE", "Pernambuco");
                estadosHT.put("PI", "Piaui");
                estadosHT.put("RJ", "Rio de Janeiro");
                estadosHT.put("RN", "Rio Grande do Norte");
                estadosHT.put("RS", "Rio Grande do Sul");
                estadosHT.put("RO", "Rondonia");
                estadosHT.put("RR", "Roraima");
                estadosHT.put("SC", "Santa Catarina");
                estadosHT.put("SP", "Sao Paulo");
                estadosHT.put("SE", "Sergipe");
                estadosHT.put("TO", "Tocantins");

                System.out.println(estadosHT);

                // Remove o estado de Minas Gerais
                estadosHT.remove("Minas Gerais");
                System.out.println(estadosHT);

                // Adiciona o Distrito Federal
                estadosHT.put("DF", "Distrito Federal");
                System.out.println(estadosHT);

                // Retorna o tamanho do mapa
                System.out.println(estadosHT.size());

                // Remove Mato Grosso do Sul pelo nome
                estadosHT.remove("Mato Grosso do Sul");
                System.out.println(estadosHT);

                // Retorna todos os componentes do mapa linha por linha
                for (String key : estadosHT.keySet()) {
                        System.out.println(estadosHT.get(key) + "(" + key + ")");
                }

                // Retorna se tem ou não Santa Catarina no mapa pela sigla
                if (estadosHT.containsKey("SC") == true) {
                        System.out.println("O mapa possui Santa Catarina");
                }
                else
                        System.out.println("O mapa não possui Santa Catarina");

                // Retorna se tem ou não Maranhão no mapa pelo nome
                if (estadosHT.containsKey("Maranhao") == true) {
                        System.out.println("O mapa possui Maranhao");
                }
                else
                        System.out.println("O mapa não possui Maranhao");

                // Exercício com HashMap
                Map<String, String> estadosHM = new HashMap<>();

                // Adiciona os 26 estados brasileiros e suas respectivas siglas
                estadosHM.put("AC", "Acre");
                estadosHM.put("AL", "Alagoas");
                estadosHM.put("AM", "Amazonas");
                estadosHM.put("AP", "Amapa");
                estadosHM.put("BA", "Bahia");
                estadosHM.put("CE", "Ceara");
                estadosHM.put("ES", "Espirito Santo");
                estadosHM.put("GO", "Goias");
                estadosHM.put("MA", "Maranhao");
                estadosHM.put("MT", "Mato Grosso");
                estadosHM.put("MS", "Mato Grosso do Sul");
                estadosHM.put("MG", "Minas Gerais");
                estadosHM.put("PB", "Paraiba");
                estadosHM.put("PA", "Para");
                estadosHM.put("PR", "Paraná");
                estadosHM.put("PE", "Pernambuco");
                estadosHM.put("PI", "Piaui");
                estadosHM.put("RJ", "Rio de Janeiro");
                estadosHM.put("RN", "Rio Grande do Norte");
                estadosHM.put("RS", "Rio Grande do Sul");
                estadosHM.put("RO", "Rondonia");
                estadosHM.put("RR", "Roraima");
                estadosHM.put("SC", "Santa Catarina");
                estadosHM.put("SP", "São Paulo");
                estadosHM.put("SE", "Sergipe");
                estadosHM.put("TO", "Tocantins");

                System.out.println(estadosHM);

                // Remove o estado de Minas Gerais
                estadosHM.remove("Minas Gerais");
                System.out.println(estadosHM);

                // Adiciona o Distrito Federal
                estadosHM.put("DF", "Distrito Federal");
                System.out.println(estadosHM);

                // Retorna o tamanho do mapa
                System.out.println(estadosHM.size());

                // Remove Mato Grosso do Sul pelo nome
                estadosHM.remove("Mato Grosso do Sul");
                System.out.println(estadosHM);

                // Retorna todos os componentes do mapa linha por linha
                for (String key : estadosHM.keySet()) {
                        System.out.println(estadosHM.get(key) + "(" + key + ")");
                }

                // Retorna se tem ou não Santa Catarina no mapa pela sigla
                if (estadosHM.containsKey("SC") == true) {
                        System.out.println("O mapa possui Santa Catarina");
                }
                else
                        System.out.println("O mapa não possui Santa Catarina");

                // Retorna se tem ou não Maranhão no mapa pelo nome
                if (estadosHM.containsKey("Maranhao") == true) {
                        System.out.println("O mapa possui Maranhao");
                }
                else
                        System.out.println("O mapa não possui Maranhao");

                // Exercício com TreeMap
                TreeMap<String, String> estadosTM = new TreeMap<>();

                // Adiciona os 26 estados brasileiros e suas respectivas siglas
                estadosTM.put("AC", "Acre");
                estadosTM.put("AL", "Alagoas");
                estadosTM.put("AM", "Amazonas");
                estadosTM.put("AP", "Amapa");
                estadosTM.put("BA", "Bahia");
                estadosTM.put("CE", "Ceara");
                estadosTM.put("ES", "Espirito Santo");
                estadosTM.put("GO", "Goias");
                estadosTM.put("MA", "Maranhao");
                estadosTM.put("MT", "Mato Grosso");
                estadosTM.put("MS", "Mato Grosso do Sul");
                estadosTM.put("MG", "Minas Gerais");
                estadosTM.put("PB", "Paraiba");
                estadosTM.put("PA", "Para");
                estadosTM.put("PR", "Paraná");
                estadosTM.put("PE", "Pernambuco");
                estadosTM.put("PI", "Piaui");
                estadosTM.put("RJ", "Rio de Janeiro");
                estadosTM.put("RN", "Rio Grande do Norte");
                estadosTM.put("RS", "Rio Grande do Sul");
                estadosTM.put("RO", "Rondonia");
                estadosTM.put("RR", "Roraima");
                estadosTM.put("SC", "Santa Catarina");
                estadosTM.put("SP", "São Paulo");
                estadosTM.put("SE", "Sergipe");
                estadosTM.put("TO", "Tocantins");

                System.out.println(estadosTM);

                // Remove o estado de Minas Gerais
                estadosTM.remove("Minas Gerais");
                System.out.println(estadosTM);

                // Adiciona o Distrito Federal
                estadosTM.put("DF", "Distrito Federal");
                System.out.println(estadosTM);

                // Retorna o tamanho do mapa
                System.out.println(estadosTM.size());

                // Remove Mato Grosso do Sul pelo nome
                estadosTM.remove("Mato Grosso do Sul");
                System.out.println(estadosTM);

                // Retorna todos os componentes do mapa linha por linha
                for (String key : estadosTM.keySet()) {
                        System.out.println(estadosTM.get(key) + "(" + key + ")");
                }

                // Retorna se tem ou não Santa Catarina no mapa pela sigla
                if (estadosTM.containsKey("SC") == true) {
                        System.out.println("O mapa possui Santa Catarina");
                }
                else
                        System.out.println("O mapa não possui Santa Catarina");

                // Retorna se tem ou não Maranhão no mapa pelo nome
                if (estadosTM.containsKey("Maranhao") == true) {
                        System.out.println("O mapa possui Maranhao");
                }
                else
                        System.out.println("O mapa não possui Maranhao");
        }
}
