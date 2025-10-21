package nivel1Ejercicio6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> elements = Arrays.asList("This", "Is", "The", "Exercise", 6, "Homework", 8, "Lambda");

        System.out.println("Original list:");
        elements.forEach(System.out::println);

        System.out.println("\nOrdered list:");

        List<Object> ordered = elements.stream()
                .sorted(Comparator.comparingInt(s -> {
                    String str = s.toString();
                    try {
                        return Integer.parseInt(str);
                    } catch (NumberFormatException exception) {
                        return str.length();
                    }
                }))
                .toList();

        ordered.forEach(System.out::println);
    }
}