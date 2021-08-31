/* Crie um optional de um determinado tipo de dado.

        * Crie com estado vazio, estado presente, e com null;
        * Se presente, exiba o valor no console;
        * Se vazio, lance uma exceção llegalstateException;
        * Se vazio, exiba "Optional vazio" no console;
        * Se presente, transforme o valor e exiba no console;
        * Se presente, pegue o valor do optional e atribua numa variável;
        * Se presente, filtre o optional com uma determinada regra de negócio.*/

package one.innovation.digital.streamecollection.optional.exercicio;

import java.util.Optional;

public class ExercicioOptional {

    public static void main(String[] args) {

        // Cria optional com estado presente
        Optional<String> optionalPresente = Optional.of("Optional com estado presente");
        optionalPresente.ifPresentOrElse(System.out::println, () -> System.out.println("Optional com estado não presente"));

        // Transforma o valor e exibe no console


        // Atribuir o valor a uma variável e exibe no console
        if (optionalPresente.isPresent()) {
            String estado = optionalPresente.get();
            System.out.println(estado);
        }

        //Filtrar o optional em uma determinada regra de negócio


        // Cria optional com estado nulo
        Optional<String> optionalNulo = Optional.ofNullable(null);
        optionalNulo.ifPresentOrElse(System.out::println, () -> System.out.println("Optional com estado nulo"));

        // Cria optional com estado vazio
        Optional<String> optionalVazio = Optional.empty();
        optionalVazio.ifPresentOrElse(System.out::println, () -> System.out.println("Optional com estado vazio"));

        // Retorna a exceção IllegalStateException
        optionalVazio.orElseThrow(IllegalStateException::new);
    }



}
