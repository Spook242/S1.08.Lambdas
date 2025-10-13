package nivel1Ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static void main(String[] args) {

        List<String> paraules = Arrays.asList("cotxe", "avió", "bicicleta", "ordinador", "taula", "sofà", "llibre");

        // Cridem el mètode que filtra les paraules amb 'o'
        List<String> ambO = filtrarContenenO(paraules);

        // Imprimim el resultat
        System.out.println("Paraules que contenen la lletra 'o':");
        ambO.forEach(System.out::println);
    }

    /**
     * Retorna una llista amb totes les cadenes que contenen la lletra 'o'
     */
    public static List<String> filtrarContenenO(List<String> llista) {
        return llista.stream()                   // Convertim la llista en un flux (Stream)
                .filter(s -> s.contains("o")) // Filtra només les que contenen 'o'
                .collect(Collectors.toList()); // Reconvertim el resultat a llista
    }
}
