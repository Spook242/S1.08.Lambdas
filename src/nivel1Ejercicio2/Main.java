package nivel1Ejercicio2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static void main(String[] args) {

        List<String> names = Arrays.asList("Lewandowski", "Torres", "Pedri", "Olmo", "Raphinha", "Yamal", "Koundé");

        List<String> result = filterOBigger(names);

        System.out.println("Names that containing the letter 'o' and more than five letters:");
        result.forEach(System.out::println);
    }

    public static List<String> filterOBigger(List<String> namesList) {
        return namesList.stream()
                .filter(n -> n.toLowerCase().contains("o") && n.length() > 5)
                .collect(Collectors.toList());
    }
}
