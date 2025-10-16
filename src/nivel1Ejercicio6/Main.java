package nivel1Ejercicio6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> elements = Arrays.asList("This", "Is", "The", "Exercise", "6", "Homework", "08", "Lambda");

        System.out.println("Original list:");
        elements.forEach(System.out::println);

        System.out.println("\nOrdered list:");

        List<String> ordered = elements.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();

        ordered.forEach(System.out::println);
    }
}