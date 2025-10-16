package nivel1Ejercicio7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> elements = Arrays.asList("This", "Is", "The", "Exercise", "7", "Homework", "08", "Lambda");

        System.out.println("Original list:");
        elements.forEach(System.out::println);

        System.out.println("\nOrdered list:");

        List<String> orderedDesc = elements.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList();

        orderedDesc.forEach(System.out::println);
    }
}