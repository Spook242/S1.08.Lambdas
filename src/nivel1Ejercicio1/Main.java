package nivel1Ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static void main(String[] args) {

        List<String> names = Arrays.asList("Lewandowski", "Torres", "Yamal", "Pedri", "Raphinha", "Olmo", "Koundé");

        List<String> ambO = filterO(names);

        System.out.println("Names that contain the letter 'o':");
        ambO.forEach(System.out::println);
    }

    public static List<String> filterO(List<String> namesList) {
        return namesList.stream()
                .filter(n -> n.contains("o"))
                .collect(Collectors.toList());
    }
}
