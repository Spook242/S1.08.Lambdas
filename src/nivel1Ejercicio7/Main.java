package nivel1Ejercicio6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Creem una llista amb nombres i cadenes de text (com a Strings)
        List<String> elements = Arrays.asList(
                "Java", "8", "Lambda", "Pi", "Stream", "42", "Functional", "Code"
        );

        System.out.println("Llista original:");
        elements.forEach(System.out::println);

        System.out.println("\nLlista ordenada per longitud (de més curta a més llarga):");

        // Usem Streams i una lambda per ordenar per longitud
        List<String> ordenada = elements.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        // Imprimim el resultat
        ordenada.forEach(System.out::println);
    }
}

