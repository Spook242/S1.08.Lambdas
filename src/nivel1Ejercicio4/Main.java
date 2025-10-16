package nivel1Ejercicio4;

import java.util.Arrays;
import java.util.List;

public class Main {

    static void main(String[] args) {

        List<String> month = Arrays.asList(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        );

        System.out.println("Months of the year:");

        month.forEach(System.out::println);
    }
}
